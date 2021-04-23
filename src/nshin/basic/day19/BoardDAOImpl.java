package nshin.basic.day19;

import nshin.basic.jdbc.JDBCUtil;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl implements BoardDAO{

    private static BoardDAO bdao = null;
    private JDBCUtil jdbc = null;

    private String insertSQL =
            " insert into board (title, userid, contents) values (?,?,?) ";
    private String selectSQL =
            " SELECT bdno, title, userid, mid(regdate,1,10)" +
                    " regdate , views, thumbup " +
                    " from board order by bdno desc ";
    private String selectOneSQL =
            " select * from board where bdno = ?";
    private String viewSQL =
            " update board set views = views + 1 where bdno =? ";
    private String thumbSQL =
            " update board set thumbup = thumbup + 1 where bdno =? ";

    private BoardDAOImpl() {
        jdbc = new JDBCUtil();
    }

    public static BoardDAO getInstance() {
        if(bdao == null) bdao= new BoardDAOImpl();
        return bdao;
    }//싱글톤


    @Override
    public int insertBoard(BoardVO bvo) {
        int cnt = 0;

        try (
            Connection conn = jdbc.openConn();
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
        ) {
            pstmt.setString(1,bvo.getTitle());
            pstmt.setString(2,bvo.getUserid());
            pstmt.setString(3,bvo.getContents());

            cnt = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cnt;
    }

    @Override
    public List<BoardVO> selectBoard() {
        List<BoardVO> bdlist = new ArrayList<>();

        try (
            Connection conn = jdbc.openConn();
            PreparedStatement pstmt = conn.prepareStatement(selectSQL);
            ResultSet rs = pstmt.executeQuery();
        ) {
            while (rs.next()) {
                BoardVO bvo = new BoardVO(
                        rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), null);
                        //생성자
                bdlist.add(bvo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bdlist;
    }

    @Override
    public BoardVO selectOneBoard(int bdno) {
        BoardVO bvo = null;

        try(
            Connection conn = jdbc.openConn();
            PreparedStatement pstmt1 = conn.prepareStatement(viewSQL);
        ) {
            pstmt1.setInt(1, bdno);
            pstmt1.executeUpdate(); // 조회수 증가

            try (
                PreparedStatement pstmt2 = conn.prepareStatement(selectOneSQL);
            ) {
                pstmt2.setInt(1, bdno);
                ResultSet rs = pstmt2.executeQuery();

                while(rs.next()) {
                    bvo = new BoardVO(rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            // 하나 실행하고 조회수 올라가야함 (transaction - 다중sql문이 실행될 때)
            // 게시판 조회수
            // i) 조회수 증가 -> 본문글 출력 (update -> select)
            // ii) 본문글 출력 -> 조회수 증가 (select -> update)
            // DCL => transaction (ACID)

        } catch (Exception e) {
            e.printStackTrace();
        }

        return bvo;
    }

    @Override
    public int updateBoard(BoardVO bvo) {
        return 0;
    }

    @Override
    public int deleteBoard(int bdno) {
        return 0;
    }

    @Override
    public void thumbupBoard(int bdno) {
        try (
            Connection conn = jdbc.openConn();
            PreparedStatement pstmt = conn.prepareStatement(thumbSQL);
        ) {
            pstmt.setInt(1, bdno);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

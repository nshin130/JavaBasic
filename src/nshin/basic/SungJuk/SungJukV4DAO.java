package nshin.basic.SungJuk;

import java.util.List;

public interface SungJukV4DAO {

    int insertSungJuk (SungJukVO sj);
    List<SungJukVO> selectSungJuk();
    SungJukVO selectOneSungJuk(int sjno); // 이 부분 잘 이해 x
    int updateSungJuk (SungJukVO sj); // 이 부분 잘 이해 x
    int deleteSungJuk (int sjno);

}

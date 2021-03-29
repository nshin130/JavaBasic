package nshin.basic.day10;

import nshin.basic.SungJuk.SungJukService;
import nshin.basic.SungJuk.SungJukServiceImpl;
import nshin.basic.SungJuk.SungJukVO;

public class SungJukV5bMain {
    public static void main(String[] args) {
       // SungJukService sjsrv = new SungJukServiceImpl();
        SungJukService sjsrv = SungJukServiceImpl.getInstance();

        SungJukVO sj = sjsrv.readSungJuk();
        sjsrv.computeSungJuk(sj);
        sjsrv.printSungJuk(sj);
    }
}

package nshin.basic.day07;

public class SungJukV4 {
    public static void main(String[] args) {
       SungJuk sj = new SungJuk("혜교", 99, 98, 99);

       sj.gpacalculator(); //성적처리

        System.out.println(sj.toString());
    }

    //성적 클래스
    static class SungJuk {

        //멤버변수
        private String name;
        private int kor;
        private int eng;
        private int math;
        private int tot;
        private double avg;
        private char grd;

        //생성자 (cmmd + N: generate)
        public SungJuk() { }

        public SungJuk(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        //성적처리
        public void gpacalculator() {
            tot = kor + eng + math;
            avg = (double)(tot) / 3;

            switch ((int)avg / 10) {
                case 10: case 9: grd = '수'; break;
                case 8: grd = '우'; break;
                case 7: grd = '미'; break;
                case 6: grd = '양'; break;
                default: grd = '가'; break;
            }
        }

        //결과출력

        @Override
        public String toString() {
            return
                    "SungJuk{" + "name=" + name + ", kor=" + kor +
                    ", eng=" + eng + ", math=" + math +
                    ", tot=" + tot + ", avg=" + avg +
                    ", grd=" + grd + '}';
        }
    }

    }

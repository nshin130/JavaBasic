package nshin.basic.day09;

import nshin.basic.day07.SungJukV4b;

public class MidSungJuk {

    //멤버변수
    protected String name;
    protected int kor;
    protected int eng;
    protected int math;
    protected int tot;
    protected double avg;
    protected char grd;

    public MidSungJuk() {
    }

    public MidSungJuk(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    public void gpacalculator() {
        tot = kor + eng + math;
        avg = (double) (tot) / 3;
        switch ((int) avg / 10) {
            case 10:
            case 9:
                grd = '수';
                break;
            case 8:
                grd = '우';
                break;
            case 7:
                grd = '미';
                break;
            case 6:
                grd = '양';
                break;
            default:
                grd = '가';
                break;
        }
    }

    //성적처리 코드를 기능별로 나누어 짬

    public void getTotal() {
        tot = kor + eng + math;
    }

    public void getMean() {
        avg = (double) (tot) / 3;
    }

    public void getGrade() {
        switch ((int) avg / 10) {
            case 10:
            case 9:
                grd = '수';
                break;
            case 8:
                grd = '우';
                break;
            case 7:
                grd = '미';
                break;
            case 6:
                grd = '양';
                break;
            default:
                grd = '가';
                break;
        }

    }
}

    class FinalSungjuk extends MidSungJuk {
        private int soc;
        private int sci;

        //생성자로 논 이랑 두개 가져와서 쓰기
        public FinalSungjuk() {
        }

        public FinalSungjuk(String name, int kor, int eng, int math, int soc, int sci) {
            super(name, kor, eng, math);
            // mid성적 이랑 겹치니까 슈퍼를 사용해서 간소화
            // 부모클래스의 생성자를 이용해서 기본변수들을 초기화
            // super: 부모클래스 자체를 의미하는 키워드
            this.soc = soc;
            this.sci = sci;
        }

        @Override
        public void gpacalculator() {
            //setTot = (getkor() + geteng() + getmath() +soc + sci);
            //부모클래스의 멤버변수 접근지정자가
            //private으로 선언된 경우 원칙적으로는 접근 불가
            //따라서 setter/getter를 이용해서 코드완성
            //코드가 다소 지저분해지는 단점

            tot = kor + eng + math + soc + sci;
            //부모클래스의 멤버변수 접근지정자가
            //protected로 선언된 경우 접근 가능
            //기존 수정없이 그대로 사용가능

            avg = (double) (tot) / 5;
            switch ((int) avg / 10) {
                case 10:
                case 9:
                    grd = '수';
                    break;
                case 8:
                    grd = '우';
                    break;
                case 7:
                    grd = '미';
                    break;
                case 6:
                    grd = '양';
                    break;
                default:
                    grd = '가';
                    break;
            }
        }

        // 기능별로 모듈화를 적용하는 경우
        // 상속관계에서 메서드 재정의시
        // 편리하게 코드를 작성할 수 있음
        @Override
        public void getTotal() {
            super.getTotal();
            tot = tot + soc + sci;
        }

        @Override
        public void getMean() {
            avg = (double) tot / 5;
        }
    }
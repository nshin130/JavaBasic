package nshin.basic.SungJuk;

public class SungJukVO {

    protected String name;
    protected int kor;
    protected int eng;
    protected int math;
    protected int tot;
    protected double avg;
    protected char grd;

    public SungJukVO(String name, int kor, int eng, int math) {
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

    @Override
    public String toString() {
        String fmt = "{name: '%s', kor: %d, eng: %d, math: %d," +
                "tot: %s, avg: %.1f, grd: '%s'}";
        String result = String.format(fmt,name,kor,eng,math,tot,avg,grd);
        return result;
    }
}


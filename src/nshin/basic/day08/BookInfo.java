package nshin.basic.day08;

public class BookInfo {
  private String bname;
  private String author;
  private String translator;
  private String publisher;
  private String pdate;
  private int price;
  private int saleprice;
  private double discountrate;
  private int point;

    public BookInfo(String bname, String author, String translator, String publisher, String pdate, int price, double discountrate) {
        this.bname = bname;
        this.author = author;
        this.translator = translator;
        this.publisher = publisher;
        this.pdate = pdate;
        this.price = price;
        this.discountrate = discountrate;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPdate() {
        return pdate;
    }

    public void setPdate(String pdate) {
        this.pdate = pdate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(int saleprice) {
        this.saleprice = saleprice;
    }

    public double getDiscountrate() {
        return discountrate;
    }

    public void setDiscountrate(double discountrate) {
        this.discountrate = discountrate;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}

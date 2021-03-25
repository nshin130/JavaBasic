package nshin.basic.day08;

public class Person {
    //멤버 변수
    private String name;
    private String gender;
    private int age;
    private int height;
    private int weight;

    //생성자

    public Person(String name, String gender, int age, int height, int weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    //setter getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

//    public static void main(String[] args) {
//        // #03. 연습문제(p. 190)
//
//        P ps = new P();
//
//       ps.setName("nnn");
//       ps.setGender("여");
//       ps.setAge(00);
//       ps.setHeight(000);
//       ps.setWeight(00);
//
//        System.out.println(ps.getName());
//        System.out.println(ps.getGender());
//        System.out.println(ps.getAge());
//        System.out.println(ps.getHeight());
//        System.out.println(ps.getWeight());
//
//    }
//
//}
//
//class P {
//    private String name;
//    private String gender;
//    private int age;
//    private int height;
//    private int weight;
//
//    public P() {
//    }
//
//    public P(String name, String gender, int age, int height, int weight) {
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//        this.height = height;
//        this.weight = weight;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public int getWeight() {
//        return weight;
//    }
//
//    public void setWeight(int weight) {
//        this.weight = weight;
//    }
//}
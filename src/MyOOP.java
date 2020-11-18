class Printt {
    public String delimiter = "";
    public Printt(String delimiter) {  // 클래스명과 같으면 생성자(constructor)가 호됨
        this.delimiter = delimiter; // 파이썬 self같은 거(인스턴스 가리킴)
    }
    public void A(){
        System.out.println(this.delimiter);
        System.out.println("A");
        System.out.println("A");
    }

    public void B(){
        System.out.println(this.delimiter); // 명시해주는게 좋음
        System.out.println("B");
        System.out.println("B");
    }
}

public class MyOOP {
    public static void main(String[] args) {

        Printt p1 = new Printt("*****");
//        p1.delimiter = "*****"; // static 제거해야 인스턴스께 됨
        p1.A();
//        p1.A();
        p1.B();
//        p1.B();

        Printt p2 = new Printt("-----");
//        p2.delimiter = "-----"; // static 제거해야 인스턴스께 됨
//        p2.A();
//        p2.A();
//        p2.B();
//        p2.B();
    }
}

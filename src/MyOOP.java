class Printt {
    public String delimiter = "";
    public void A(){
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }

    public void B(){
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}

public class MyOOP {
    public static void main(String[] args) {

        Printt p1 = new Printt();
        p1.delimiter = "*****"; // static 제거해야 인스턴스께 됨
        p1.A();
        p1.A();
        p1.B();
        p1.B();

        Printt p2 = new Printt();
        p2.delimiter = "-----"; // static 제거해야 인스턴스께 됨
        p2.A();
        p2.A();
        p2.B();
        p2.B();
    }
}

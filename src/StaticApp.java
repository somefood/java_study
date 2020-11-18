class Foo {
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";
    public static void classMethod(){
        System.out.println(classVar);    // 접근됨.
//        System.out.println(instanceVar); // 접근 안됨
    }
    public void instanceMethod(){
        System.out.println(classVar);       // 접근 됨.
        System.out.println(instanceVar);    // 접근 됨.
    }
}

public class StaticApp {
    public static void main(String[] args) {
//        System.out.println(Foo.classVar);    // 접근 됨.
//        System.out.println(Foo.instanceVar); // 접근 안됨.
        Foo.classMethod(); // 접근 됨.
//        Foo.instanceMethod();  // 접근 안됨

        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println(f1.classVar); // 접근 됨
        System.out.println(f1.instanceVar);

        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar); // 클래스 변수 내용 변경 됨
        System.out.println(f2.classVar);

        f1.instanceVar = "change by f1";
        System.out.println(f1.instanceVar); // change by f1
        System.out.println(f2.instanceVar); // I instance var - 내용 그대로
    }
}

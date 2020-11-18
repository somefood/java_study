class Cal {
    public int sum(int v1, int v2){
        return v1 + v2;
    }

    // Overloading, 과적하기 - 같은 메소드 명으로 다른 인자 개수를 받을 수 있다.
    public int sum(int v1, int v2, int v3){
        return v1 + v2 + v3;
    }
}

class Cal2 extends Cal {
    // Overriding 부모꺼 덮어 씌우기
    public int sum(int v1, int v2){
        System.out.println("Cal2!!");
        return v1+ v2;
    }

    public int sum(int v1, int v2, int v3){
        return v1 + v2 + v3;
    }

    public int minus(int v1, int v2){
        return v1 - v2;
    }
}

public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.sum(2, 1));
        System.out.println(c.sum(2, 1, 3));

        Cal2 c2 = new Cal2();
        System.out.println(c2.minus(3, 4));
        System.out.println(c2.sum(3, 4));
    }
}

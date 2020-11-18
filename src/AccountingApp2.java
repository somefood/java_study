class Accounting {
    public double valueOfSupply;
    public static double vatRate = 0.1; // 고정된 값은 클래스 변수로 둬서 메모리 절약도 할 수 있다.

    public Accounting(double valueOfSupply) {  // 생성자, 파이썬 __init__(self)와 유
        this.valueOfSupply = valueOfSupply;
    }

    public double getVAT(){
        return this.valueOfSupply * vatRate;
    }

    public double getTotal(){
        return this.valueOfSupply + getVAT();
    }
}
public class AccountingApp2 {

    public static void main(String[] args) {
        Accounting a1 = new Accounting(10000.0);
        Accounting a2 = new Accounting(20000.0);

        System.out.println(a1.getVAT());
        System.out.println(a2.getVAT());

        System.out.println(a1.getTotal());
        System.out.println(a2.getTotal());
    }
}

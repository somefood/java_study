public class BooleanApp {
    public static void main(String[] args) {
        System.out.println("One"); // 문자열
        System.out.println(1); // 정수형
        System.out.println(true);
        System.out.println(false);

        System.out.println(1 > 1); // false
        System.out.println(1 == 1); // true
        System.out.println(1 < 1);
        System.out.println(1 >= 1);

        if(false) {
            System.out.println(1);
        } else if(true) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
        System.out.println("b");

        String id = "egoing";
        String inputId = args[0];

        String pass = "1111";
        String inputPass = args[1];

        System.out.println("Hi.");

        if(inputId.equals(id) && inputPass.equals(pass)) {
            System.out.println("Master!");
        } else {
            System.out.println("Who are you?");
        }
    }

}

public class StringApp {
    public static void main(String[] args){
        System.out.println("Hello World!"); // String
        System.out.println('H'); // Error 자바에서는 Character(한 글자만)
        System.out.println("H"); // 얘는 String

        System.out.println("Hello " +
                "World");

        System.out.println("Hello \nWorld");

        // 이스케이프 (일반 문자열로 인식하게끔)
        System.out.println("Hello \"World\"");
    }
}

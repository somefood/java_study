public class FirstMethod {

    public static String a(){ // return값이 String
        return "a";
    }

    public static int one(){ // return값이 정수형
        return 1;
    }

    public static void main(String[] args) {
        printTwoTimes("A", "*");
        printTwoTimes("B", "-");

        System.out.println(twoTimes("a","*"));
    }

    public static String twoTimes(String text, String delimieter) {
        String out = "";
        out = out + delimieter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;
    }

    public static void printTwoTimes(String text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
}

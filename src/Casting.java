public class Casting {
    public static void main(String[] args){
        double a = 1.1;
        double b = 1;
        System.out.println(b); // 컨버팅 됨

//        int c = 1.1;
        double d = 1.1;
        int e = (int) 1.1; // 형 변환
        System.out.println(e);

        // 1 to String
        String f = Integer.toString(1);
        System.out.println(f.getClass());
    }
}

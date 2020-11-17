public class LoopApp {
    public static void main(String[] args) {

        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }

        for (i=0; i < 3; i++){
            System.out.println(i);
        }

        String[] users = new String[3];
        users[0] = "seokju";
        users[1] = "nahyun";
        users[2] = "egoing";

        int [] intarr = {1, 2, 3};
        System.out.println(intarr);

        for (i=0; i<users.length; i++){
            System.out.println(users[i]);
        }
    }
}


import java.util.Scanner;

public class ungraded {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hour (H): ");
        int H = sc.nextInt();
        System.out.print("Enter Water Units (W): ");
        int W = sc.nextInt();
        int water = 1;
        boolean flag = false;

        for (int i = 1; i <= H; i++) {

            if (i % 2 == 0) {
                water = H * 4;
            } else {
                water = H * 3;
            }

            W -= water;
            if (W < 0) {
                System.out.println("Stopped at Hour " + i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("All watered");
            System.out.println(W + " Water Unit Left");
        }
    }

}

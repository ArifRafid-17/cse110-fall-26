import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("output: " + (2 * x));
        } else if (x >= 0 && x < 2) {
            System.out.println("output: " + (x + 1));
        } else if (x >= 2 && x < 5) {
            System.out.println("output: " + ((x * x) - 1));
        } else {
            System.out.println("output: " + (3*(x * x) + 2));
        }
    }
}

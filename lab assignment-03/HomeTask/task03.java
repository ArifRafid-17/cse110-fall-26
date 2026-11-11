
import java.util.Scanner;

public class task03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Energy(E): ");
        int energy = sc.nextInt();

        System.out.print("Number of River(N): ");
        int rivers = sc.nextInt();

        boolean flag = false;

        for (int i = 1; i <= rivers; i++) {
            System.out.print("Enter River Distance D" + i + ": ");
            int D = sc.nextInt();

            if (D <= 5) {
                energy -= 2;
            } else {
                double temp = D / 2;
                energy -= (int) temp;
            }
            if (energy < 0) {
                System.out.println("Tired at River " + i);
                flag = true;
                break;
            }

        }

        if (!flag) {
            System.out.println("All Done");
            System.out.println(energy + " energy Left");
        }
    }
}

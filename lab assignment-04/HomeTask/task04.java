
import java.util.Scanner;

public class task04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Members: ");
        int M = sc.nextInt();

        for (int i = 1; i <= M; i++) {
            System.out.print("Exercises for Member-" + i + ": ");
            int E = sc.nextInt();
            int rawSum = 0;
            int sum = 0;
            if (E > 3) {
                System.out.println("(Can't do more than 3 exercise)");
                int temp = E - 3;
                E = E - temp;

            }

            for (int j = 1; j <= E; j++) {
                System.out.print("Exercise-" + j + ": ");
                int ex = sc.nextInt();
                rawSum+=ex;

                if (ex > 350) {
                    ex += (ex * 0.5);
                }
                if (ex < 200) {
                    ex -= (ex * 0.1);
                }
                sum+=ex;
            }

            double rawAvg =rawSum / E;
            double avg = sum/E;
            if (rawAvg > 400) {
                avg += 50;
            }


            System.out.println("Average calories earned per day for Member-" + i + ": " + avg);
        }
    }
}

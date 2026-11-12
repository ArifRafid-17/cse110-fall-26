import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Students (S): ");
        int S = sc.nextInt();
        System.out.print("Missions (M): ");
        int M = sc.nextInt();
        int maxlevel = 0;
        double maxAvg = -1.0;

        for (int i = 1; i <= S; i++) {
            double sum = 0.0;
            System.out.println("Scores of Student " + i + ": ");
            for (int j = 1; j <= M; j++) {
                int scores = sc.nextInt();
                sum += scores;
            }
            double avg = sum / M;
            System.out.println("Average point of Student " + i + ": " + avg);
            if (maxAvg < avg) {
                maxAvg = avg;
                maxlevel = i;
            }
        }

        System.out.println("Student " + maxlevel + " receives the badge of honour!!");
    }
}

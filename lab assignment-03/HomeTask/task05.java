
import java.util.Scanner;

public class task05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N-digit vault code: ");
        int pin = sc.nextInt();

        int count = 0;
        int temp = 1;
        int tempPin = pin;
        while (tempPin > 0) {
            tempPin /= 10;
            temp *= 10;
            count++;
        }

        temp /= 10;

        for (int i = 1; i <= count; i++) {
            int digit = pin / temp;
            pin %= temp;
            temp /= 10;
            System.out.print(digit + "... ");
        }
    }
}

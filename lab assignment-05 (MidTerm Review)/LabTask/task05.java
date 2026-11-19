import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN code: ");
        int pin = sc.nextInt();
        System.out.println("Frequency of digits: ");
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + ":");
            int temp = pin;
            int count = 0;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == i) {
                    count++;
                }
                temp = temp / 10;
            }
            System.out.println(count);
        }
    }
}
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN (4 Digit): ");
        int pin = sc.nextInt();

        if (pin >= 1000 && pin <= 9999) {
            int d1 = pin / 1000;
            int d2 = (pin / 100) % 10; 
            int d3 = (pin / 10) % 10; 
            int d4 = pin % 10;
            int count = 0;

            if (d1 == d4 && d2 == d3) {
                System.out.println("Rejected: Palindrome.");
            } 
            else if (((d2 - d1) == (d3 - d2)) && ((d3 - d2) == (d4 - d3))) {
                System.out.println("Rejected: Sequential Pattern");
            } 
            else if ((d1 + d2) == (d3 * d4)) {
                System.out.println("Master Vault Access Granted.");
            } 
            else {
                if (d1 % 2 == 0) {
                    count++;
                }
                if (d2 % 2 == 0) {
                    count++;
                }
                if (d3 % 2 == 0) {
                    count++;
                }
                if (d4 % 2 == 0) {
                    count++;
                }

                if (count == 2) {
                    System.out.println("Standard Access Granted");
                } else {
                    System.out.println("Rejected: Parity Mismatch");
                }
            }
        } 
        else {
            System.out.println("Invalid PIN Length");
        }
    }
}
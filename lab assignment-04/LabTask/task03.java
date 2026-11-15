
import java.util.Scanner;

public class task03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of pairs: ");
        int P = sc.nextInt();

        for (int i = 1; i <= P; i++) {
            System.out.println("Pair " + i + ": ");
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            int count=1;
            System.out.print("Pair "+i+": ");
            while (true) {
                int div = num1 % num2;
                if(div==0 && count==1){
                    System.out.println("GCD = "+div);
                    break;
                }
                else if(div==0 && count!=1){
                    System.out.println("GCD = "+num2);
                    break;
                }

                if (div != 0) {
                    num1=num2;
                    num2 = div;
                    count++;
                }
            }

        }
    }
}

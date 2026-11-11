
import java.util.Scanner;

public class task08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int N = sc.nextInt();
        int nonNeg=0;
        int Neg=0;

        for(int i=1; i<=N; i++){
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();
            if(number<0){
                Neg++;
            }
            if(number>=0){
                nonNeg++;
            }
        }

        System.out.println(nonNeg+" Non-negative Numbers");
        System.out.println(Neg+" Negative Numbers");

    }
}

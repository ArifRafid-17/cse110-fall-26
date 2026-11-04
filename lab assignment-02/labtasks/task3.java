import java.util.Scanner;
public class task3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        if(a%5==0 && a%7==0){
            System.out.println("Divisible by Both");
        }
        else if(a%5==0 && a%7!=0){
            System.out.println("Invalid: Divisible by 5 only");
        }
        else if(a%5!=0 && a%7==0){
            System.out.println("Invalid: Divisible by 7 only");
        }
        else{
            System.out.println("No");
        }

    }
}

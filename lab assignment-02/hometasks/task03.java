import java.util.Scanner;
public class task03 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your first Number: ");
        double a = sc.nextDouble();
        System.out.print("Enter your Second Number: ");
        double b = sc.nextDouble();
        System.out.print("Enter your third Number: ");
        double c = sc.nextDouble();

        if(a >= b && a >= c){
            System.out.println("Maximum Number is "+a);
            if(b < c){
                System.out.println("Minimum Number is "+b);
            }
            else{
                System.out.println("Minimum Number is "+c);
            }
        }
        else if(b >= a && b >= c){
            System.out.println("Maximum Number is "+b);
            if(a < c){
                System.out.println("Minimum Number is "+a);
            }
            else{
                System.out.println("Minimum Number is "+c);
            }
        }
        else if(c >= a && c >= b){
             System.out.println("Maximum Number is "+c);
             if(a < b){
                System.out.println("Minimum Number is "+a);
            }
            else{
                System.out.println("Minimum Number is "+b);
            }
        }
    }
}

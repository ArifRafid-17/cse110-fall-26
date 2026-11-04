import java.util.Scanner;
public class task1{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter your Second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter your third Number: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("Largest Number: "+a);

        }

        if(b>a && b>c){
            System.out.println("Largest Number: "+b);
        }

        if(c>a && c>b){
             System.out.println("Largest Number: "+c);
        }
    }
}
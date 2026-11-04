import java.util.Scanner;
public class task2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your Number: ");
        int a = sc.nextInt();
        if(100<a && a<0){
        if(90<=a && a<=100){
            System.out.println("Your grade is A");
        }
        if(85<=a && a<=89){
            System.out.println("Your grade is A-");
        }
        if(70<=a && a<=84){
            System.out.println("Your grade is B");
        }
        if(57<=a && a<=69){
            System.out.println("Your grade is C");
        }
        if(50<=a && a<=56){
            System.out.println("Your grade is D");
        }
        if(a<50){
            System.out.println("Your grade is F");
        }
    }
    else{
        System.out.println("Your number is not valid");
    }
    }
}

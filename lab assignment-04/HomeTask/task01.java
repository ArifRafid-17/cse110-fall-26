import java.util.Scanner;

public class task01 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Weeks, W: ");
        int W = sc.nextInt();
        int strl = 0;

        for(int i=1 ; i<=W; i++){
            for(int j=1; j<=i; j++){
                strl -=j;
            }
        }
        System.out.println("STRL= "+strl);
    }
}

import java.util.Scanner;
public class task01{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count =0;

        for(int i=1; i<=N; i++){
            for(int j = 1; j<=N; j++){
                if(i%j==0 && i>j){
                    System.out.println(i+ " beats "+j);
                    count++;
                }
            }
        }

        System.out.println("Total wins: "+count);
    }
}
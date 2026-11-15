import java.util.Scanner;
public class task04 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your starting number: ");
        int S = sc.nextInt();
        System.out.print("Enter your ending number: ");
        int F = sc.nextInt();

        System.out.println("Armstrong Numbers: ");
        for(int i=S; i<=F ; i++){
            int temp = i;
            
            int DigitCount =0;
            while(temp>0){
                temp /=10;
                DigitCount++;
            }

            int temp2 = i;
            int sum = 0;
            while(temp2>0){
                int digit = temp2%10;
                int sq=1;
                for(int k=1; k<=DigitCount; k++){
                    sq = sq*digit;
                }
                sum+=sq;
                temp2 = temp2/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }    
}

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int U = sc.nextInt();
        int D = sc.nextInt();
         boolean flag = false;

        for (int i = L; i <= U; i++) {
            int temp = i;
            int count = 0;

            while (temp > 0) {
                int digit = temp % 10;
                if (digit == D) {
                    count++;
                }
                temp = temp / 10;

                if(i==U){
                    flag = true;
                }
            }
            if (count > 0) {
                System.out.print(i);

                if(!flag){
                    System.out.print(", ");
                }
                else{
                    System.out.print(". ");
                }
            } 
        
        }
    }
}

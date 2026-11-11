import java.util.Scanner;

public class task06 {
   public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    int sum =0;
    int divisorCount=0;

    for(int i=1; i<=num; i++){
        if(num%i == 0){
            divisorCount++;
            if(i!=num){
                sum+=i;
            }
           
        }
    }

    if(divisorCount==2){
        System.out.println(num +" is a prime number");
    }
    else{
        System.out.println(num + " is not a prime number");
    }

    if(sum == num){
        System.out.println(num + " is a perfect number");

    }
    else{
        System.out.println(num + " is not a perfect number");
    }

}
}

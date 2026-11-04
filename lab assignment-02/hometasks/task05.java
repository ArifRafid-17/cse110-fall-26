import java.util.Scanner;
public class task05 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount the customer need to pay(Taka): ");
        int amount = sc.nextInt();
        System.out.print("Enter the amount, customer gave(Taka): ");
        int given = sc.nextInt();
        int change = given - amount;
        if(amount > given){
            int due = amount - given;
            System.out.println("Please pay "+due+" taka more.");
        }
        else if(amount == given){
            System.out.println("The returned amount is 0 taka.");
        }
        else{
            System.out.println("The returned amount is "+change+" taka.");
            int hundredNote = 0;
            int fiftyNote = 0;
            int twentyNote = 0;
            int tenNote = 0;
            int fiveCoin = 0;
            int twoCoin = 0;
            int oneCoin = 0;

            if(change >=100){
                hundredNote = change / 100;
                change = change % 100;
            }
            if(change >=50){
                fiftyNote = change / 50;
                change = change % 50;
            }
            if(change >=20){
                twentyNote = change / 20;
                change = change % 20;
            }
            if(change >=10){
                tenNote = change / 10;
                change = change % 10;
            }
            if(change >=5){
                fiveCoin = change / 5;
                change = change % 5;
            }
            if(change >=2){
                twoCoin = change / 2;
                change = change % 2;
            }
            if(change >=1){
                oneCoin = change / 1;
            }

            System.out.println("100 Taka note: "+hundredNote);
            System.out.println("50 Taka note: "+fiftyNote);
            System.out.println("20 Taka note: "+twentyNote);
            System.out.println("10 Taka note: "+tenNote);
            System.out.println("5 Taka coin: "+fiveCoin);
            System.out.println("2 Taka coin: "+twoCoin);
            System.out.println("1 Taka coin: "+oneCoin);

        }
    }
}

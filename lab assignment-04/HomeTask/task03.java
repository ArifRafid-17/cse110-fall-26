import java.util.Scanner;
public class task03 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int Days = sc.nextInt();

        for(int i= 1 ; i<=Days; i++){
            System.out.println("Enter sales for Day "+i+": ");
            double totalSale=0;
            for(int j=1; j<=3; j++){
                int sale = sc.nextInt();
                totalSale+=sale;
            }

            if(totalSale>=500 ){
                totalSale +=(totalSale*0.1);
                System.out.println("Day "+i+": Total Sales with Tax: "+totalSale);
            }
            else if(totalSale>=200){
                totalSale +=(totalSale*0.05);
                System.out.println("Day "+i+": Total Sales with Tax: "+totalSale);
            }
            else if(totalSale>=100){
                totalSale +=(totalSale*0.02);
                System.out.println("Day "+i+": Total Sales with Tax: "+totalSale);
            }
        }

    }
}

import java.util.Scanner;
public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Electricity Consumed: ");
        int electricityConsumed = sc.nextInt();

        double totalBill = electricityConsumed * 15;

        boolean flag = false;
        if(electricityConsumed > 100) {
            flag = true;
        }

        if (age < 18) {
            double discountedBill = totalBill - (totalBill * 0.20);
            if(flag) {
                double discountedBillWithSurcharge = discountedBill + (discountedBill * 0.05);
                System.out.println("Final Bill: " + discountedBillWithSurcharge);
            }
            else{
                System.out.println("Final Bill: " + discountedBill+ " Taka");
            }
            
        } 
        else if (age > 60) {
            double discountedBill = totalBill - (totalBill * 0.10);
            if(flag) {
                double discountedBillWithSurcharge = discountedBill + (discountedBill * 0.05);
                System.out.println("Final Bill: " + discountedBillWithSurcharge+ " Taka");
            }
            else{
                System.out.println("Final Bill: " + discountedBill+ " Taka");
            }
        } 
        else {
            if(flag) {
                double BillWithSurcharge = totalBill + (totalBill * 0.05);
                System.out.println("Final Bill: " + BillWithSurcharge+ " Taka");
            }
            else{
                System.out.println("Final Bill: " + totalBill+ " Taka");
            }
        }        
    }
}

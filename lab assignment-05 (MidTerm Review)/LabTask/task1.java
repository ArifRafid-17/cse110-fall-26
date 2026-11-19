import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Karim's Salary (x): ");
        double x = sc.nextDouble();

        double totalAmount = x + (0.75 * x);
        double wifeBudget = 0.45 * totalAmount;
        double sonBudget = 0.45 * totalAmount;
        double savings = 0.10 * totalAmount;

        System.out.println("Amount with Bonus: " +  totalAmount);
        System.out.println("Wife Budget: " + wifeBudget);
        System.out.println("Son Budget: " +  sonBudget);
        System.out.println("Savings: " +  savings);

        double wifeCost = 90000;
        double sonCost = 70000 + 7000;

        double wifeRemaining = 0;
        if (wifeBudget > wifeCost) {
            wifeRemaining = wifeBudget - wifeCost;
        }
        double sonRemaining = 0;
        if (sonBudget > sonCost) {
            sonRemaining = sonBudget - sonCost;
        }
        if (wifeBudget >= wifeCost) {
            System.out.println("Shopping Done for Wife!");
        } 
        else if (wifeBudget + sonRemaining >= wifeCost) {
            System.out.println("Shopping Done for Wife with remaining money from Sons budget!");
        } 
        else {
            System.out.println("Cannot do shopping for wife even with remaining money from his son's budget!");
        }
        if (sonBudget >= sonCost) {
            System.out.println("Shopping Done for Son!");
        }
         else if (sonBudget + wifeRemaining >= sonCost) {
            System.out.println("Shopping Done for Son with remaining money from Wifes budget!");
        } 
        else {
            System.out.println("Cannot do shopping for son even with remaining money from his wife's budget!");
        }
    }
}
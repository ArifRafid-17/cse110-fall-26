package LabTasks;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }

            int ans = num * num;
            System.out.println(num + " ^ 2 = " + ans);
        }
    }
}

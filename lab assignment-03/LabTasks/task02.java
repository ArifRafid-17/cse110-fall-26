package LabTasks;

import java.util.Scanner;
public class task02 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N= ");
        int N = sc.nextInt();
        int sum=0;
        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            sum+=num;
        }

        double avg = sum/N;

        System.out.println("The sum of "+N+" number is : "+sum);
        System.out.println("The Average is : "+avg);

    }
}

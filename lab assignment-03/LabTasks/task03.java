package LabTasks;
import java.util.Scanner;
public class task03 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of days: ");
        int day = sc.nextInt();
        int power = 40;
        int black=0;
        boolean flag = false;

        for(int i=1; i<=day; i++){
            if(i %3==0){
                power-=45;
            }
            else if(i % 5==0 ){
                power += 25;
            }
            else{
                power+=10;
            }
            if(power>500){
                power-=50;
            }
            if(power<0){
                black = i;
                flag = true;
                break;
            }
        }
        
        if(flag){
            System.out.println("Blackout on Day "+black);
        }
        else{
            System.out.println("Final Power: "+power);
        }

    }
}

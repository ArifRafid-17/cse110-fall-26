import java.util.Scanner;

public class task02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students to check: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();

            if(id<=0){
                System.out.println("Not Lucky");

            }
            else{
                while(id%2==0){
                    id /=2;
                }

                if(id==1){
                    System.out.println("Lucky ID");

                }
                else{
                    System.out.println("Not Lucky");
                }
            }
    }
}
}

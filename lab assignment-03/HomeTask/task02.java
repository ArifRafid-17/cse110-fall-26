import java.util.Scanner;
public class task02 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter number of Herbs(H): ");
        int H = sc.nextInt();
        System.out.print("Please Enter number of Crystals(C): ");
        int C = sc.nextInt();

        int count =0;

        for(int i=1; ;i++){
            if(H<3 || C<2){
                break;
            }
            else{
                H-=3;
                C-=2;
                System.out.println("Portion- "+i+" created");
                System.out.println("Remaining Herbs: "+H+", Remaining Crystals: "+C);
                count = i;
            }
        }

        System.out.println("Portions Created: "+count);

        if(count%2==0){
            System.out.println("Stable Elixir");
        }
        else{
            System.out.println("Volatile Elixir");
        }

    }
}

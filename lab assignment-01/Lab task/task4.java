public class task4 {
    public static void main(String [] args){
        int num = 12345;
        int lastNum = num % 100;

        System.out.println(lastNum);

        int lastRightNum = lastNum % 10;
        int lastRightSecondNum = lastNum / 10;
        System.out.println(lastRightNum);
        System.out.println(lastRightSecondNum); 
    }
}

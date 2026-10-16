public class task3 {
    public static void main(String [] args){
        int id = 1000054943;
        int rightTwoDigit = id % 100;
        int RightDigit = rightTwoDigit%10;
        int leftDigit = rightTwoDigit /10;
        System.out.println("---------------Reversed Two Rightmost Digits-------------");
        System.out.println(RightDigit+" "+ leftDigit);
    }
}

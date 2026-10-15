public class task6 {
    public static void main(String [] args){
        int firstNum =3;
        int secondNum = 4;

        System.out.println("Your first num: "+firstNum);
        System.out.println("Your second num: "+secondNum);

        int temp;

        temp =firstNum;
        firstNum= secondNum;
        secondNum = temp;

        System.out.println("...........After Swapping.........");

        System.out.println("Your first num: "+firstNum);
        System.out.println("Your second num: "+secondNum);
    }
}

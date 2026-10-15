public class task6 {
    public static void main(String [] args){


        //a

        System.out.println("......Creating a new Variable");
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


        //b

        System.out.println("......Without Creating any other variable.......");

        int firstNum1 =3;
        int secondNum1 = 4;

        firstNum1=firstNum1+secondNum1;
        secondNum1=firstNum1-secondNum1;
        firstNum1=firstNum1-secondNum1;


        System.out.println("...........After Swapping.........");

        System.out.println("Your first num: "+firstNum);
        System.out.println("Your second num: "+secondNum);

        


    }
}

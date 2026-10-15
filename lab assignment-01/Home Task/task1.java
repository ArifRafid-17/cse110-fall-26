public class task1 {
    public static void main(String [] args){
        int minutes= 3456789;
        double totalMinutes = minutes ;
        double year = minutes / (365*24*60);

        double existedHours =(totalMinutes / (365*24*60))-year;
        double days = existedHours*60;

        // System.out.println(totalMinutes+" minutes exactly "+ (int)year+ " years and "+(int)days+ " days");
    }    
}

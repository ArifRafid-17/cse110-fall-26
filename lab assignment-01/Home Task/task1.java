public class task1 {
    public static void main(String [] args){
        int minutes= 3456789;
        double totalMinutes = minutes ;
        double year = minutes / (365*24*60);
        double existedYear =(totalMinutes / (365*24*60))-year;
        double days = existedYear * 365;
        System.out.println(minutes +" minutes is approximately "+ (int)year+ " years and "+(int)days+ " days");
    }    
}
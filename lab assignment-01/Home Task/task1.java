public class task1 {
    public static void main(String[] args) {
        int minutes= 3456789;
        int year = minutes / (365 * 24 * 60);
        int remainingMinutes = minutes % (365 * 24 * 60);
        int days = remainingMinutes / (24 * 60);
        System.out.println(minutes + " minutes is approximately " + (int) year + " years and " + (int) days + " days");
    }
}
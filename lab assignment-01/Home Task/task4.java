public class task4 {
    public static void main(String [] args){
        int width = 13;
        int length = 10;

        double shortestLength = (width*width) + (length* length);
        double result = Math.sqrt(shortestLength);
        // double result = Math.pow(shortestLength, 0.5);
        System.out.println("Shortest Length is "+result);
    }
}

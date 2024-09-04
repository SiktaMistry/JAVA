import java.util.Scanner;

public class pt1o4 {
    public static void main(String[] args) {
        System.out.println("Enter the Kilometers");
        Scanner k = new Scanner(System.in);
        float kilo = k.nextFloat();
        System.out.printf("The converted Miles from the Kilometers is %f",kilo/1.609);
    }
    
}

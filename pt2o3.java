import java.util.Scanner;

public class pt2o3 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        System.out.println("Is the number entered by user is greater than 5 : "+(num>5));
    }
    
}

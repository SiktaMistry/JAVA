import java.net.SocketTimeoutException;
import java.util.Scanner;

public class pt5o3 {
    public static void main(String[] args) {
        System.out.println("enter a number :");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        for(int i=1;i<=20;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}

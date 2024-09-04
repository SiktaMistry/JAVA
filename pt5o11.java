import java.util.Scanner;

public class pt5o11 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner n = new Scanner(System.in);
        int num =n.nextInt();
        int i=1;
        int sum =0;
        while(i<=num){
            sum+=i*2;
            i++;
        }
        System.out.println(sum);
    }
}

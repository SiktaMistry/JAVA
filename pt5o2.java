import java.util.Scanner;

public class pt5o2{
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner n = new Scanner(System.in);
        int num  = n.nextInt();
        int sum =0;
        for(int i=1;i<=num;i++){
            sum +=(2*i); 
        }
        System.out.println("The sum of first n even number is: "+sum);
    }
}
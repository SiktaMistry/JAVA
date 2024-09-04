import java.util.Scanner;

public class pt5o6 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner n= new Scanner(System.in);
        int num = n.nextInt();
        int i = 1;
        int fac=1;
        while(i<=num){
            fac*=i;
            i++;
        }
        System.out.println(fac);
    }
    
}

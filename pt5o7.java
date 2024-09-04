import java.util.Scanner;

public class pt5o7 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner n =  new Scanner(System.in);
        int num = n.nextInt();
        int i=num; 
        while(i>0){
            int j=i;
            while(j>0){
                System.out.print("*");
                j--;
            }
            System.out.print("\n");
            i--;
        }
    }
}

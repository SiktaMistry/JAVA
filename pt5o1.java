import java.util.Scanner;

public class pt5o1 {
    public static void main(String[] args) {
        System.out.println("enter the number of time you want this pattern");
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
            System.out.print("*");

        }
        System.out.print("\n");
    }
}
}

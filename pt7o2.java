import java.util.Scanner;

public class pt7o2 {
    static void pattern(int a){
        int b=1;
        while(b<=a){
            System.out.print("*");
            b++;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            pattern(i);
            System.out.println();
        }

    }
}

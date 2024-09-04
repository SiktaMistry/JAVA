import java.util.Scanner;

public class pt7o1 {
    static int mulTable(int a,int b){
        int c =a*b;
        return c;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+mulTable(n,i));

        }
    }
}

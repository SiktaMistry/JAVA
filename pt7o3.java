import java.util.Scanner;

public class pt7o3 {
    static int sum(int a){
        if(a==1){
            return 1;
        }
        return a+sum(a-1);
        }
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
System.out.println(sum(n));
    }
    
}

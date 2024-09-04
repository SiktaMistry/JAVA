import java.util.Scanner;

public class pt5o5 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner n = new Scanner(System.in);
        int num =  n.nextInt();
        int fac=1;
        if(num==0){
            System.out.println(num+"! = 0");
        }
        else if(num>=1){
        for(int i=1;i<=num;i++){
            fac*=i;
    }
    System.out.println(num+"! = "+fac);
}

}
}

import java.util.Scanner;
public class ex1{
    public static void main(String[]args){
        System.out.println("Enter your English marks");
        Scanner e = new Scanner(System.in);
        int eng = e.nextInt();
        System.out.println("Enter your Maths marks");
        Scanner m = new Scanner(System.in);
        int maths = m.nextInt();
        System.out.println("Enter your Chemistry marks");
        Scanner c = new Scanner(System.in);
        int chem = c.nextInt();
        System.out.println("Enter your Biology marks");
        Scanner b = new Scanner(System.in);
        int bio = b.nextInt();
        System.out.println("Enter your Physics marks");
        Scanner p = new Scanner(System.in);
        int phy = p.nextInt();
        System.out.printf("You got : %d percent marks ",(eng+maths+bio+chem+phy)/5);
    }
}
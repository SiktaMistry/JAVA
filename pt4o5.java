import java.util.Scanner;

public class pt4o5 {
    public static void main(String[] args) {
        System.out.println("Enter a year");
        Scanner y = new Scanner(System.in);
        int year = y.nextInt();
        if(year%4==0)
        System.out.println("The year "+year+" is a Leap Year");
        else
        System.out.println("This year is not a leap year");
    }
}

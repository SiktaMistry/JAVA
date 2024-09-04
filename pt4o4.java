import java.util.Scanner;

public class pt4o4 {
    public static void main(String[] args) {
        System.out.println("Enter the number of the day of the week");
        Scanner d= new Scanner(System.in);
        int day = d.nextInt();
        switch(day){
            case 1:
            System.out.println("This is monday");
            break;
            case 2:
            System.out.println("This is tuesday");
            break;
            case 3:
            System.out.println("This is wednesday");
            break;
            case 4:
            System.out.println("This is thursday");
            break;
            case 5:
            System.out.println("This is friday");
            break;
            case 6:
            System.out.println("This is saturday");
            break;
            case 7:
            System.out.println("This is sunday");
            break;
        }

    }
    
}

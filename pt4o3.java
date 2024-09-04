import java.util.Scanner;

public class pt4o3 {
    public static void main(String[] args) {
        System.out.println("Enter your Income:");
        Scanner i = new Scanner(System.in);
        int inc = i.nextInt();
        float tax=0;
        if(inc>=250000&&inc<500000){
        tax = inc*5/100.f;}
        else if(inc>=500000&&inc<=1000000){
        tax = inc*20/100.f;}
        else if(inc>1000000){
        tax = inc*30/100.f;}
        System.out.printf("Your incometax is: %f",tax);
    }
    
}

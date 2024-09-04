import java.util.Scanner;

public class pt2o2 {
    public static void main(String[] args) {
        System.out.println("Enter your grade");
        Scanner s = new Scanner(System.in);
        int grade =s.nextInt();
        int encrypt = grade +8;
        System.out.println("Your encypted grade is: "+encrypt);
        int decrypt = encrypt -8;
        System.out.println("The decrypted grade is : "+decrypt);
    }
    
}

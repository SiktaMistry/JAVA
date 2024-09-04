import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class pt4o2{
    public static void main(String[] args) {
        System.out.println("Enter your maths marks: ");
        Scanner m =new Scanner(System.in);
        int math = m.nextInt();
        System.out.println("Enter your english marks: ");
        Scanner e = new Scanner(System.in);
        int eng = e.nextInt();
        System.out.println("Enter your chemistry marks: ");
        Scanner c = new Scanner(System.in);
        int chem = c.nextInt();
        if(math>=33&&eng>=33&&chem>=33&&((math+eng+chem)/3)>=40)
        System.out.println("You pass");
        else
        System.out.println("You have failed");
    }
}
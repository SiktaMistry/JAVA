import java.util.Scanner;

public class pt4o6 {
    public static void main(String[] args) {
        System.out.println("Enter a name of website:");
        Scanner w= new Scanner(System.in);
        String url = w.next();
        if(url.endsWith(".com")) 
        System.out.println("This website "+url+" is a commercial website");
        else if(url.endsWith(".org")) 
        System.out.println("This website "+url+" is a organization website");
        else if(url.endsWith(".in")) 
        System.out.println("This website "+url+" is a Indian website");
    }
}

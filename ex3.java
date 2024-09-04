import java.util.Random;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("WELCOME TO THE GAME OF GUESSING THE NUMBER\n");
        System.out.println("RULES :\nThe Computer will guess a Number.\nThe Number is between the Range of 1 and 100\nYou get five Chance to Answer");
        System.out.println("\nTHE COMPUTER HAS GUESSED A NUMBER");
        Random rand= new Random();
        int c= rand.nextInt(100)+1;
        System.out.println(c);
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        for(int i=1;i<=4;i++){
            System.out.println();
            while(p<1||p>100){
                System.out.println("\nThe number you Entered is not within the Range mentioned in the Rules");
                System.out.println("Please Enter a Number between the range 1 and 100");
                p=s.nextInt();
            }
            if(c==p){
                System.out.println("Congratulations! you Guessed the Right number : "+p);
                break;
            }
            else if(c>p){
                System.out.println("The number is Greater than "+p);
            }
            else if(c<p){
                System.out.println("The number is less than "+p);
            }
            System.out.println("\nGuess The number again");
            System.out.printf("You have %d more chance to guess\n",5-i);
            p=s.nextInt();
        }
     if(p==c){
        System.out.println("Congratulations! you Guessed the Right number : "+p);
     }  
     else{
        System.out.println("\nYou Lose 0 Chances left");
        System.out.println("The right answer was "+c);
     }     
    }
}
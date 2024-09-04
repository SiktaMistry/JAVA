import java.util.Random;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
     System.out.println("WELCOME TO THE STONE-PAPER-SCISSOR GAME\n");   
    System.out.println("PLAYER CHOOSE BETWEEN STONE,PAPER AND SCISSOR(1 , 2 , 3)\n   1 : STONE\n   2 : PAPER\n   3 : SCISSOR");
    Scanner s = new Scanner(System.in);
    int p = s.nextInt();
    while(p<1||p>3){
        System.out.println("Please Enter a Number between 1 and 3 for the Game to Begin!!");
        p=s.nextInt();
        }
        Random rand= new Random();
        int c=rand.nextInt(3)+1;
       switch(p){
        case 1:
        System.out.println("PLAYER : STONE");
        break;
        case 2:
        System.out.println("PLAYER : PAPER");
        break;
        case 3:
        System.out.println("PLAYER : SCISSOR");
        break;
       }
       switch(c){
        case 1:
        System.out.println("COMPUTER : STONE");
        break;
        case 2:
        System.out.println("COMPUTER : PAPER");
        break;
        case 3:
        System.out.println("COMPUTER : SCISSOR");
        break;}
        if(p==c){
            System.out.println("THE GAME IS DRAW");
        }
        else if(c==(p-1)||(p+2)==c){
            System.out.println("CONGRATULATIONS!! YOU WIN THE GAME");
        }
        else{
            System.out.println("YOU LOSE, BETTER LUCK NEXT TIME");
        }
    }
}

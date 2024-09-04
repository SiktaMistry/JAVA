import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;


class Library{
    public int addBook(){

    }
    public int removeBook(){

        }
    public int issueBook(){

    }
    public void returnBook(){

    }
    public void showAvailableBooks(){

    }

}
public class ex4 {


    static int Initialize(){
    Scanner n= new Scanner(System.in);
    int num =n.nextInt();
    if(num>1||num<0){
        while(num>1||num<0){
            System.out.println("You Entered something wrong");
            System.out.println("Please Enter 1 to Start the Online Library or 0 to Stop the Online Library");
            num = n.nextInt();
        }
    }
    if(num==1){
    System.out.println("The Online Library has started");
    System.out.println("Press 1 to add Book\nPress 2 to remove Book\nPress 3 to issue Books\nPress 4 to return Books\nPress 5 to show available Books");
    choice();
    }
    if(num==0){
        System.out.println("The Online Library has been stopped");
    }
    return num;
}


    static void choice(){
        Scanner p =  new Scanner(System.in);
        int pum =  p.nextInt();
        while(pum<1||pum>5){
            System.out.println("The number You choosed is not within the given range");
            System.out.println("Please Enter between 1 and 5");
            pum = p.nextInt();
        }
        switch(pum){
            case 1:
            lib.addBook();
            break;
            case 2:
            lib.removeBook();
            break;
            case 3:
            lib.issueBook();
            break;
            case 4:
            lib.returnBook();
            break;
            case 5:
            lib.showAvailableBooks();
            break;
        }
    }


    public static void main(String[] args) {
        System.out.println("\nWELCOME TO THE ONLINE LIBRARY\n\n");
        System.out.println("Press 1 to start the Online Library \nPress 0 to stop The Online Library\n");
        Library lib = new Library();
        int a=1;
        a=Initialize();
        while(a!=0){
        System.out.println("Press 1 to continue using Online Library or Press 0 to stop");
        a=Initialize();
    }
}    
}

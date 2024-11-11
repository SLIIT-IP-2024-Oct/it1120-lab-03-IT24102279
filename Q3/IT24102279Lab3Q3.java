import java.util.Scanner;

public class IT24102279Lab3Q3{
    public static void main(String[] args) {
        int money, remainder, n5000, n1000, n500, n200, n100, n50, n20, n10, n5, n2, n1; //declare variables for money 
        
        System.out.print("Enter the rupee amount");
        Scanner input1 = new Scanner(System.in);
        money = input1.nextInt();
        
        //n5000 means number of 5000 notes
        n5000 = money / 5000;
        remainder = money - n5000*5000;

        n1000 = remainder / 1000;
        remainder = remainder - n1000*1000;

        n500 = remainder / 500;
        remainder = remainder - n500*500;

        n200 = remainder / 200;  // we don't use 200 notes in sri lanka anymore but since the question specifies I kept the 200 notes too
        remainder = remainder - n200*200;

        n100 = remainder / 100;
        remainder = remainder - n100*100;
        
        n50 = remainder / 50;
        remainder = remainder - n50*50;

        n20 = remainder / 20;
        remainder = remainder - n20*20;

        n10 = remainder / 10;
        remainder = remainder - n10*10;

        n5 = remainder / 5;
        remainder = remainder - n5*5;

        n2 = remainder / 2;
        remainder = remainder - n2*2;

        // we do not need to do the remainder calcualtion for this last part
        n1 = remainder / 1;
    

        // Print the result for each denomination used s
        System.out.println("5000 Notes – " + n5000);
        System.out.println("1000 Notes – " + n1000);
        System.out.println("500 Notes – " + n500);
        System.out.println("200 Notes – " + n200);
        System.out.println("100 Notes – " + n100);
        System.out.println("50 Notes – " + n50);
        System.out.println("20 Notes – " + n20);
        System.out.println("10 Coins – " + n10);
        System.out.println("05 Coins – " + n5);
        System.out.println("02 Coins – " + n2);
        System.out.println("01 Coins – " + n1);
    }
}

import java.util.Scanner;
public class IT24102279Lab3Q1 {
    
    public static void main(String[] args) {
        System.out.print("Enter the price of 1kg of rice : ");
        Scanner input =  new Scanner(System.in);
        double priceKg = input.nextDouble();
        
        Scanner input2 =  new Scanner(System.in);
        System.out.print("Enter the amount of rice you want in kg :");
        int riceKg = input2.nextInt();
       
       System.out.println("Your bill is "+ riceKg*priceKg) ;
    }
}
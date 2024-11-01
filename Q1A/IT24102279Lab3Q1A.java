import java.util.Scanner;
public class IT24102279Lab3Q1A {
    
    public static void main(String[] args) {
        System.out.print("Enter the price of 1kg of rice : ");
        Scanner input =  new Scanner(System.in); //define scanner instance and namme it input)
        double priceKg = input.nextDouble(); // get the double entered by the user and store it in a double
        
        Scanner input2 =  new Scanner(System.in);
        System.out.print("Enter the amount of rice you want in kg :");
        double riceKg = input2.nextDouble();
       
       System.out.println("Your bill is "+ riceKg*priceKg) ;
    }
}

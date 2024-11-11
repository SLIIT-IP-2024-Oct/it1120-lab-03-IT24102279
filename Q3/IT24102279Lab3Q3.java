import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int salary, otHours, otRate; // declare variables 
        float total;//since the question has a decimal point in the answer I used a float type here
        
        Scanner input1 = new Scanner(System.in);// input1, input2, input3 are scanner variables
        System.out.print("Enter Salary ");
        salary = input1.nextInt(); // geting the int from the user the next two are just like this
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter OT hours ");
        otHours = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter OT rate ");
        otRate = input3.nextInt();
    
        
        total = salary + otHours*otRate; //does the salary total calculation
        System.out.println("Your total salary is ");
        System.out.println(total);
        
        
    }
}
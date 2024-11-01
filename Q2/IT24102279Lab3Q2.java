import java.util.Scanner;

class IT24102279Lab3Q2 {
    public static void main(String[] args) {
        double monthlySal, otRate;
        int otHours;
        System.out.print("Enter monthly salary :");
        Scanner salInput = new Scanner(System.in);
        monthlySal = salInput.nextDouble();
        
        System.out.print("Enter ot Hours :");
        Scanner otHrsInput = new Scanner(System.in);
        otHours = otHrsInput.nextInt();
        
        System.out.print("Enter ot Hourly rate :");
        Scanner otRateInput = new Scanner(System.in);
        otRate = otRateInput.nextDouble();
         
        double totalSal = monthlySal + otRate*otHours;
        System.out.println("The total salary including OT is " + totalSal);
        
    }
}
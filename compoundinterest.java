import java.util.*;

public class compoundinterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("InitialDeposit: ");
        double initialDeposit = input.nextDouble();

        System.out.print("AnnualInterestRate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Month: ");
        int month = input.nextInt();

        double monthlyInterestRate = (annualInterestRate / 12) / 100;

        double finalAmount = initialDeposit * Math.pow(1 + monthlyInterestRate, month);
        System.out.println(finalAmount);

    }
}
import java.util.*; 

public class MortgageCalculator {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Annual InterestRate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Years: ");
        int loanYears = input.nextInt();

        double monthlyAnnualInterestRate = (annualInterestRate / 12) / 100;

        double numerator = loanAmount * monthlyAnnualInterestRate * Math.pow(1 + monthlyAnnualInterestRate, loanYears*12);
        double denominator = Math.pow(1 + monthlyAnnualInterestRate, loanYears * 12)-1;

        
        double monthlyInstallmentAmount = numerator / denominator ;

        System.out.println(monthlyInstallmentAmount);
    }
}

package com.dbresults.app;

public class App {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Loan Calculator".toUpperCase());
        System.out.println();

        int loanAmount = 5000; // Changed the initial loan amount to 5000
        int numYears = 5;
        double intRate = 1.5;
        int yearsRemaining = numYears;

        while (yearsRemaining > 0) {
            loanAmount += (loanAmount * intRate / 100);
            yearsRemaining--;
        }

        if (loanAmount > 0 && numYears > 0 && intRate > 0) {
            PrintAmounts(loanAmount, numYears, intRate);

            LoanCalc calculator = new LoanCalc(loanAmount, numYears, intRate);
            double totalLoan = calculator.calculateLoan();
            System.out.println("Total Loan Amount: " + totalLoan);
        } else {
            System.out.println("Cannot Compute.");
        }
    }

    private static void PrintAmounts(int loanAmount, int numYears, double intRate) {
        System.out.println("Calculating loan using:");
        System.out.println("Loan Amount:  " + loanAmount);
        System.out.println("Number of Years: " + numYears);
        System.out.println("Interest Rate: " + intRate);
    }
}

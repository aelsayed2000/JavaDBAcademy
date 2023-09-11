package com.dbresults.app;

public class App {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Loan Calculator".toUpperCase());
        System.out.println();

        int loanAmount = 5000;
        int numYears = 5;
        double intRate = 1.5;
        int yearsRemaining = numYears;

        while (yearsRemaining > 0) {
            double interest = loanAmount * (intRate / 100);
            loanAmount += interest;
            yearsRemaining--;
        }

        try {
            LoanCalc calculator = new LoanCalc(loanAmount, numYears, intRate);
            double totalLoan = calculator.calculateLoan();
            System.out.println("Total Loan Amount: " + totalLoan);
        } catch (ExceptionCalc e) {
            System.out.println(e.getMessage());
        }
    }
}

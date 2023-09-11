package com.dbresults.app;

public class App {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Loan Calculator".toUpperCase());
        System.out.println();

        int loanAmount = 50;
        int numYears = 5;
        double intRate = 1.5;
        int yearsRemaining = numYears;

        while (yearsRemaining > 0) {
            loanAmount += loanAmount;
            yearsRemaining--;
        }

        if (loanAmount > 0 && numYears > 0 && intRate > 0) {
            PrintAmounts(loanAmount, numYears, intRate);

            CalculateLoan(loanAmount, intRate, numYears);
        } else {
            System.out.println("Cannot Compute.");
        }
    }

    private static void CalculateLoan(int loanAmount, double intRate, int numYears) {
        double calculation = loanAmount * (1 + (intRate / 100) * numYears);
        System.out.println("You owe: " + calculation);
    }

    private static void PrintAmounts(int loanAmount, int numYears, double intRate) {
        System.out.println("Calculating loan using:");
        System.out.println("Loan Amount:  " + loanAmount);
        System.out.println("Number of Years: " + numYears);
        System.out.println("Interest Rate: " + intRate);
    }
}

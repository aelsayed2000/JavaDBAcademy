package com.dbresults.app;

public class App {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Loan Calculator".toUpperCase());
        System.out.println();
        int LoanAmount = 50;
        int NumYears = 5;
        double IntRate = 1.5;
        if (LoanAmount > 0 && NumYears > 0 && IntRate > 0) {
            System.out.println("Calculating loan using:");
            System.out.println("Loan Amount:  " + LoanAmount);
            System.out.println("Number of Years: " + NumYears);
            System.out.println("Interest Rate: " + IntRate);
            double Calculation = LoanAmount * (1 + (IntRate / 100) * NumYears);
            System.out.println("You owe: " + Calculation);
        } else {
            System.out.println("Cannot Compute.");
        }
    }
}

package com.dbresults.app;

public class App {
    public static void main(String[] args) {
        System.out.println("Loan Calculator".toUpperCase());
        System.out.println();
        int LoanAmount = 1000;
        int NumYears = 5;
        double IntRate = 1.5;

        System.out.println("Calculating loan using:");

        System.out.println("Loan Amount:  " + LoanAmount);

        System.out.println("Number of Years: " + NumYears);

        System.out.println("Interest Rate: " + IntRate);


        double Calculation = LoanAmount * (1 + (IntRate / 100) * NumYears);
        System.out.println("You owe: " + Calculation);


    }
}

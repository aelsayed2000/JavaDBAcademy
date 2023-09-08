package com.dbresults.app;

public class App {
    public static void main(String[] args) {
        int LoanAmount = 1000;
        int NumYears = 5;
        double IntRate = 1.5;

        double Calculation = LoanAmount * (1 + (IntRate / 100) * NumYears);
        String AmountOwed = String.valueOf(Calculation);
    }
}

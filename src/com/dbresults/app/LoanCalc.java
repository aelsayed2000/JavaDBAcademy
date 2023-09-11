package com.dbresults.app;

public class LoanCalc {
    private int loanAmount;
    private int numYears;
    private double intRate;

    public LoanCalc(int loanAmount, int numYears, double intRate) {
        this.loanAmount = loanAmount;
        this.numYears = numYears;
        this.intRate = intRate;
    }

    public double calculateLoan() {
        double intRate = 1 + this.intRate / 100;
        return loanAmount * Math.pow(intRate, numYears);
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public int getNumYears() {
        return numYears;
    }

    public double getIntRate() {
        return intRate;
    }
}
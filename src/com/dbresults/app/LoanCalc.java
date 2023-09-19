package com.dbresults.app;

public class LoanCalc {
    private int loanAmount;
    private int numYears;
    private double intRate;

    public LoanCalc() {
        System.out.println("I am here");
    }

    public LoanCalc(int loanAmount, int numYears, double intRate) throws ExceptionCalc {
        System.out.println("I am here2");
        if (loanAmount <= 0 || numYears <= 0 || intRate <= 0) {
            throw new ExceptionCalc("Inputs are not valid.");
        }
        this.loanAmount = loanAmount;
        this.numYears = numYears;
        this.intRate = intRate;
    }

    public LoanCalc(int loanAmount, double intRate) throws ExceptionCalc.AhmadException {
        System.out.println("I am here3");
        if (loanAmount <= 1 || intRate <= 1) {
            throw new ExceptionCalc.AhmadException("Loan amount and interest rate must be greater than 1.");
        }
        this.loanAmount = loanAmount;
        this.numYears = 10;
        this.intRate = intRate;
    }

    public double calculateLoan() {
        double intRate = 1 + this.intRate / 100;
        return loanAmount * Math.pow(intRate, numYears);
    }
}

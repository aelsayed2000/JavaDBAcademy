package com.dbresults.app;

public class App {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Loan Calculator".toUpperCase());
        System.out.println();

        int loanAmount = -1000;
        double intRate = 1.5;

        try {
            LoanCalc calculator = new LoanCalc(loanAmount, intRate);
            double totalLoan = calculator.calculateLoan();
            System.out.println("Total Loan Amount: " + totalLoan);
        } catch (ExceptionCalc.AhmadException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unhandled Exception: " + e.getMessage());
        }
        }
    }

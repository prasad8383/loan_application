package com.loan.app.vo;

public class LoanCalculations {
    private int intersetRate;
    private int calcInterestAmount;
    private int sacLoanAmount;

    private String provider;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public int getIntersetRate() {
        return intersetRate;
    }

    public void setIntersetRate(int intersetRate) {
        this.intersetRate = intersetRate;
    }

    public int getCalcInterestAmount() {
        return calcInterestAmount;
    }

    public void setCalcInterestAmount(int calcInterestAmount) {
        this.calcInterestAmount = calcInterestAmount;
    }

    public int getSacLoanAmount() {
        return sacLoanAmount;
    }

    public void setSacLoanAmount(int sacLoanAmount) {
        this.sacLoanAmount = sacLoanAmount;
    }
}

package com.app.myloan;

import java.time.LocalDate;
import java.util.Date;

public class EMI {
    private int principal;
    private int interest;
    private int totalPrincipal;
    private LocalDate emiDate;
    public EMI() {

    }
    public EMI(int principal, int interest, int totalPrincipal, LocalDate emiDate) {
        this.principal = principal;
        this.interest = interest;
        this.totalPrincipal = totalPrincipal;
        this.emiDate = emiDate;
    }

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public int getTotalPrincipal() {
        return totalPrincipal;
    }

    public void setTotalPrincipal(int totalPrincipal) {
        this.totalPrincipal = totalPrincipal;
    }

    public LocalDate getEmiDate() {
        return emiDate;
    }

    public void setEmiDate(LocalDate emiDate) {
        this.emiDate = emiDate;
    }



}

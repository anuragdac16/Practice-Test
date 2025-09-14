package com.app;

import java.util.concurrent.atomic.AtomicInteger;

public class Transaction {

    private int transactionId;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public AtomicInteger getTotalAmount() {
        return totalAmount;
    }

    public void addTotalAmount(int totalAmount) {
        this.totalAmount.addAndGet(totalAmount);
    }

    public void removeTotalAmount(int totalAmount) {
        this.totalAmount.addAndGet(totalAmount*-1);
    }

    AtomicInteger totalAmount = new AtomicInteger(0);

}

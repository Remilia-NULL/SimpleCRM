package com.example.demo.pojo;

public class Statistics {
    private String customerName;
    private int countId;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCountId() {
        return countId;
    }

    public void setCountId(int countId) {
        this.countId = countId;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "customerName='" + customerName + '\'' +
                ", countId=" + countId +
                '}';
    }
}

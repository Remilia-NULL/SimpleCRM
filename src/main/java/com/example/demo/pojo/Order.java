package com.example.demo.pojo;

public class Order {
    private int ordersId;
    private int customerId;
    private String goods;
    private double amount;
    private String ordersDate;

    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getOrdersDate() {
        return ordersDate;
    }

    public void setOrdersDate(String ordersDate) {
        this.ordersDate = ordersDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ordersId=" + ordersId +
                ", customerId=" + customerId +
                ", goods='" + goods + '\'' +
                ", amount=" + amount +
                ", ordersDate='" + ordersDate + '\'' +
                '}';
    }
}

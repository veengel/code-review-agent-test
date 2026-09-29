package com.example;

public class OrderService {

    public String formatOrder(String orderId) {
        try {
            return orderId.trim().toUpperCase();
        } catch (Exception exception) {
            return "Invalid order";
        }
    }
}
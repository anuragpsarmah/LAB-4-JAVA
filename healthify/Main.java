package com.healthify;

public class Main {
    public static void main(String[] args) {
        Health myHealth = new Health("Anurag", 80, 184);
        System.out.println(myHealth.getBMI());
    }
}

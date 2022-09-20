package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 15;
        System.out.println(prime(n));
    }

    static boolean prime(int n) {
        boolean prime = true;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                prime = false;
                break;
            }

        }

        return prime;
    }
}



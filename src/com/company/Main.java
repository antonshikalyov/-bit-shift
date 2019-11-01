package com.company;

public class Main {

    public static void main(String[] args) {
        int v = 0b1101;
        int x;
        for (int bit = 1; bit < 5; bit++) {

            if (bit <= 2){
                x = (v ^ bit);
            }
            else if (bit == 3){
                x = ((~((((v ^ bit) >>> 1) ^ bit) << 1))* -1);
            }
            else {
                x = (~(v & bit)* -1);
            }
            System.out.println(x);
        }
    }
}
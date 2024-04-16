package dev.lokeshdebugs.Mathematics;

public class CountDigits {
    public static void main(String[] args) {

        int number = 78657;
        int count =0;

        while(number > 0){
            number = number/10;
            count++;
        }

        System.out.println("Total Digits:" + count);
    }
}

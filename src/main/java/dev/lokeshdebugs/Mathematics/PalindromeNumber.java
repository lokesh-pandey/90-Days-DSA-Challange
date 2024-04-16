package dev.lokeshdebugs.Mathematics;

public class PalindromeNumber {
    public static void main(String[] args) {

        int number = 78987;
        int temp = number;
        int reverseNumber = 0;

        while (temp != 0){
            int lastDigit = temp % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            temp = temp/10;
        }

        if(number == reverseNumber){
            System.out.println("Palindrome or Not: " +true);
        }

    }
}

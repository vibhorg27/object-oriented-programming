package com.bridgelabz.classandobject.levetwo;

import java.util.Scanner;

class PalindromeChecker{
    String text;

    public String getReverseString(String text){
        String reverseText = "";
        for(int i = text.length() - 1 ; i >=0 ; i--){
            reverseText = reverseText + text.charAt(i);

        }
        return reverseText;
    }

    public boolean isPalindrome(String text){
        return text.equals(getReverseString(text));
    }
}

public class Palindrome {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        PalindromeChecker palindrome = new PalindromeChecker();
        System.out.print("Enter Strings: ");
        String text = input.nextLine();

        System.out.println("The string " + text + " is palindrome: " + palindrome.isPalindrome(text));
    }
}

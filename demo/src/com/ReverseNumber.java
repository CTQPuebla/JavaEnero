package com;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        // put your code here
        String entryNumber = scanner.nextLine();
        String holder = "";
        for(int i = entryNumber.length()-1; i >= 0; i--){
        	Character charToString = new Character(entryNumber.charAt(i));
            holder += charToString.toString();
        }
        scanner.close();
        System.out.println(Integer.valueOf(holder));
	}

}

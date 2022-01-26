package com;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays6 {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		boolean datesBoolean = true;
		int numberOfDates = 0;
		do {
			try {
				System.out.println("Please enter how many dates you want");
				numberOfDates = entry.nextInt();
				System.out.println("Creating an array of : " + numberOfDates + " random dates");
				datesBoolean = false;
			}
			catch (InputMismatchException err) {
				System.out.println("Please enter a valid number");
				entry.nextLine();
			}
		} while (datesBoolean);
		String[] dates = new String[numberOfDates];
		for(int i = 0; i < dates.length ; i++) {
			Integer randomYear = new Integer((int)Math.floor(Math.random()*2022));
			Integer randomMonth = new Integer((int)Math.round(Math.random()*11)+1);
			LocalDate dateMonthYear = LocalDate.of(randomYear, randomMonth, 1);
			int randomDayInt = dateMonthYear.lengthOfMonth();
			Integer randomDay = new Integer((int)Math.round(Math.random()*(randomDayInt-1))+1);
			LocalDate randomDate = LocalDate.of(randomYear, randomMonth, randomDay);
			String randomDateString = randomDate.toString();
			dates[i] = randomDateString;
		}
		entry.close();
		System.out.println(Arrays.deepToString(dates));
		System.out.println("\nEach date equals to: ");
		for(String element: dates) {
			LocalDate currentDate = LocalDate.parse(element);
			System.out.print(
					element.substring(8, 10)+ "-" +
					element.substring(5, 7)+ "-" +
					element.substring(0,4)
					+ " is "
					);
			System.out.print(currentDate.getDayOfWeek().toString().toLowerCase()+ " " + element.substring(8, 10) + " of ");
			System.out.print(currentDate.getMonth().toString().toLowerCase() + " from ");
			System.out.print(currentDate.getYear() + " ");
			System.out.println();
		}
	}

}

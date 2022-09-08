package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What year are you checking?");
		int year = in.nextInt();
		boolean check = year%4 == 0;
		boolean check2 = year%100 != 0;
		boolean check3 = year%400 == 0;
		boolean leapyear = check && (check2 || check3);
		System.out.print(year + " is a leap year:" + leapyear);
		
	}

}

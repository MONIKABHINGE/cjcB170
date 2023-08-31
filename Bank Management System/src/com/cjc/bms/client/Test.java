package com.cjc.bms.client;

import java.util.Scanner;

import com.cjc.bms.serviceImpl.Sbi;

public class Test {

	public static void main(String[] args) {
		Sbi s = new Sbi();
		System.out.println("1: createAccount \n" + "2: displayAllDetails \n" + "3: depositeMoney \n"
				+ "4: withdrawal \n" + "5: balanceCheck");
		while (true) {

			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();

			if (ch == 1) {
				s.createAccount();
			}

			else if (ch == 2) {
				s.displayAllDetails();
			}

			else if (ch == 3) {
				s.depositeMoney();
			}

			else if (ch == 4) {
				s.withdrawal();
			}

			else if (ch == 5) {
				s.balanceCheck();
			}

			else if (ch == 6) {
				System.out.println("Exit");
			} else {
				System.out.println("wrong choice");
			}
		}
	}
}
package com.cjc.bms.serviceImpl;

import com.cjc.bms.model.Account;
import com.cjc.bms.service.Rbi;
import java.util.*;

public class Sbi implements Rbi {

	Account a = new Account();

	Scanner sc = new Scanner(System.in);

	@Override
	public void createAccount() {
		System.out.println("Enter your name");
		a.setName(sc.next());

		System.out.println("Enter your mobno");
		a.setMobNo(sc.next());

		System.out.println("Enter your accno");
		a.setAccNo(sc.nextInt());

		System.out.println("Enter your gender");
		a.setGender(sc.next());

		System.out.println("Enter your aadharno");
		a.setAadharNo(sc.nextInt());

		System.out.println("Enter your age");
		a.setAge(sc.nextInt());

		System.out.println("Enter your balance");
		a.setBalance(sc.nextInt());
	}

	@Override
	public void displayAllDetails() {

		System.out.println(a.getAccNo());
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(a.getAadharNo());
		System.out.println(a.getMobNo());
		System.out.println(a.getGender());
		System.out.println(a.getBalance());

	}

	@Override
	public void depositeMoney() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter money you have to deposited");
		double x = sc.nextDouble();

		double new_bal = a.getBalance() + x;

		a.setBalance(new_bal);

	}

	@Override
	public void withdrawal() {
		System.out.println("Enter money you have to withraw");
		double wid = sc.nextDouble();

		double wid_bal = a.getBalance() - wid;
		a.setBalance(wid_bal);

	}

	@Override
	public void balanceCheck() {

		System.out.println(a.getBalance());

	}

}

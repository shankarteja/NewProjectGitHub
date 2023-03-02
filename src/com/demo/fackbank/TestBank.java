package com.demo.fackbank;

import java.util.Scanner;

import com.demo.fackbank.*;

public class TestBank {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter the bank name to get the data");
		String bankNameString = objScanner.next();
		if (bankNameString.equalsIgnoreCase("HDFC")) {
			HDFC objHdfc = new HDFC();
			objHdfc.demat();
			execute(objHdfc);
		} else if (bankNameString.equalsIgnoreCase("ICICI")) {
			ICICI objIcici = new ICICI();
			objIcici.demat();
			execute(objIcici);
		}else {
			System.out.println("enter valid bank name");
		}
	}
	public static void execute(RBI r) {
		r.createAcc();
		r.processLoan();
	}

}

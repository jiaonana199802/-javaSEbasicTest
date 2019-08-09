package com.neuedu.practice;

import java.util.Scanner;

public class Year {
	public static void main(String[] args) {
		Year years = new Year();
		System.out.println(years.getYear());
	}
	public boolean getYear() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year = scanner.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0) {
			return true;
		}else {
			return false;
		}
		
	}

}

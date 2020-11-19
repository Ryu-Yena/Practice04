package com.javaex.practice04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int wonArray[] = {50000,10000,5000,1000,500,100,50,10,5,1};
		int money;
		int count[] = new int[10];
 		
		System.out.print("금액 : ");
		money = sc.nextInt();
		
		for(int i =0; i<wonArray.length;i++) {
			count[i] = money/wonArray[i];
			System.out.println(wonArray[i]+"원: "+count[i]+"개");
			money = money-wonArray[i]*count[i];
			}
		sc.close();
	}
}

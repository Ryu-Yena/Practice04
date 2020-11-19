package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float[] nArray = new float[5];
		int i;
		float avr=0;
		
		for(i=0;i<nArray.length;i++) {
			nArray[i] = sc.nextFloat();
			avr = nArray[i] + avr;
		}System.out.println("평균은 "+(avr/i)+"입니다.");
		sc.close();
	}
}

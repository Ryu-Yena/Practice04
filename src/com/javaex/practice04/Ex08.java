package com.javaex.practice04;

public class Ex08 {

	public static void main(String[] args) {
		int lottonum[] = new int[6];
		
		for(int i=0;i<lottonum.length;i++) {
			lottonum[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i;j++) {
				if(lottonum[j]==lottonum[i]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0;i<lottonum.length;i++) {
			System.out.print(lottonum[i]+"\t");
		}
		
	}
}

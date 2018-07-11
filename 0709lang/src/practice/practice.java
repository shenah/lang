package practice;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
// 문제1:
		/*Scanner sc = new Scanner(System.in);
		System.out.println("금액:");
		int money = sc.nextInt();
		int oman = money/50000;
		int irman= (money%50000)/10000;
		System.out.println("5만원 " + oman + "장" + "  만원 " + irman + "장");*/
//문제2:
		/*int i, j;
		for(i=1; i<=5; i++) {
			if(i<=3) {
				for(j=1; j<=4-i; j++) {
					System.out.print("*");
				}
			}
			else {
				for(j=1; j<=i-2; j++) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}*/
		
		Integer [][] ar = new Integer [5][5];
		for(int i=0; i<25; i++) {
			System.out.println("%3d, ar[i/5][i%5]");
			if(i%5 == 4) {
				System.out.println("\n");
			}
		}
		
//문제3:
		int i=0, j=0;
		int m = 0;
		for(i=0; i<6; i++) {
			
			for(j=5-i; j>0; j++) {
				System.out.println(" ");
			}
			System.out.println(m);
			if(i>0) {
				for(j=2*i-3; j>0; j++) {
					System.out.println(" ");
				}
				System.out.println(m+1);
			}
			else 
			for(j=5-i; j>0; j++) {
				System.out.println(" ");
			}
			m = m + 1;
		}
		
	}
}

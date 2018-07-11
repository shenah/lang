package wrapperclass;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		/*int x = -1;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("정수입력:");
			String temp = sc.nextLine();
			try {
				x = Integer.parseInt(temp);
				break;
			} catch(Exception e){
				System.out.println("정수를 입력하세요.");
			}
		}
		System.out.println(x);
		sc.close();*/

		//1~45까지 중복되지 않는 6개의 정수 저장
		int [] lotto = new int [6];
		int size = lotto.length;
		int i, j;
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<size; i=i+1) {
			try {
				System.out.print("1~45 사이의 정수 입력:");
				String temp = sc.nextLine();
				lotto [i] = Integer.parseInt(temp);
				if(lotto[i]<1 || lotto[i]>45) {
					System.out.println("1~45 사이의 정수를 다시 입력하세요.");
					i = i - 1;
				}
				for (j = 0; j <= i - 1; j = j + 1) {
					if (lotto[i] == lotto[j]) {
						//System.out.println("동일한 데이터는 안됩니다.");
						//i = i - 1;
						break;
					}	
				}
				if(j != i) {
					System.out.println("동일한 데이터는 안됩니다.");
					i = i - 1;
					continue;
				}

			} catch (Exception e) {
				System.out.println("정수를 입력하세요.");
				i = i - 1;
			}

		}
		
		for(i=0; i<size; i=i+1){
			System.out.println(lotto[i]);
		}
		sc.close();
		
	}

}

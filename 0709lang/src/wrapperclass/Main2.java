package wrapperclass;

public class Main2 {

	public static void main(String[] args) {
		for(int i=0; i<6; i=i+1) {
			if(i<=3) {
				for(int j=0; j<i; j=j+1) {
					System.out.print("*");
				}
			}
			else {
				for(int j=0; j<6-i; j=j+1) {
					System.out.print("*");
					}
				}
			System.out.println("");
			}
		}
	}


package lang;

public class Main1 {

	public static void main(String[] args) {
		//value 형 변수 생성
		int n = 10;
		//value 형의 데이터를 대입
		int x = n;	
		x = 20;	
		System.out.println(n);
		
		// 참조형 데이터의 복사 - 주소가 복사
		int [] ar = {10, 20, 30};
		int [] br = ar;
		br[0] = 20;
		System.out.println(ar[0]);
		
		//참조형을 복사해 줄 때 실제 데이터를 복사해주기 
		int [] cr = new int[ar.length];
		for(int i=0;i<ar.length;i=i+1){
			cr[i]=ar[i];
		}
		cr[0] = 50;
		System.out.println(ar[0]);

	}

}

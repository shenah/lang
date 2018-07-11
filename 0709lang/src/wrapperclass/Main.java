package wrapperclass;

public class Main {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		//toString(클래스이름@해스코드)을 재정의 
		System.out.println(i);
		
		i = 20;
		System.out.println(i);
		
		i= Integer.parseInt("800");
		System.out.println(i);

	}

}

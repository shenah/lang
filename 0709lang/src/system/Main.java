package system;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//java.lang.System
		//"Hello World" 10만번 출력하는데 걸리는 시간 계산하기
		/*Long start = System.currentTimeMillis();
		for(int i=0; i<100000; i=i+1) {
			System.out.println("Hello World!");
		}
		long end = System.currentTimeMillis();
		System.out.println("작업시간:"+(end - start));*/
		//환격변수 확인
		System.out.println(System.getenv("path"));
		//시스템 속성 확인
		System.out.println(System.getProperty("java.version"));
		
		//java.lang.Runtime
		/*Runtime r = Runtime.getRuntime();
		try {
			r.exec("C:\\Windows\\explorer https://www.naver.com");// 경로입력시 역슬레시 두개   \\
			r.exec("explorer https://www.naver.com");
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		//java.lang.String
		String str = "Hello";
		int size = str.length();
		for(int i=0; i<size; i++) {
			char ch = str.charAt(i);
			//소문자 대문자 변환
			if(ch>='a' && ch<='z') {
				ch = (char)(ch-32);//연산의 최소단위는 int, 강제 형변환 사용
			}
			System.out.println(ch);
		}
		
		

	}

}

package java_test;

import java.util.Scanner;

public class Test02 {
	
	static int init;
	
	public static void main(String[] args) {
		
		int i;
		
		System.out.println(init
		
//		System.out.println(i); // initialized(초기화)를 안해 줬기 때문에 오류가 나는 거다.
		i = 100;
		System.out.println(i);
		
		Scanner scan = new Scanner(System.in); //scan을 종료시켜줘여 빨간 줄이 사라진다. scan.close();
		
		String str = scan.nextLine();
		
		System.out.println(str);
		
		scan.close();
//		
//		String[] classGroup = {"정원영", "정원순"};
//		System.out.println(classGroup[0]);
//		
//		//배열을 초기화 하는 2가지 방법
//		// 1
//		int[] e = {1,3,4,5};
//		System.out.println(e[0]);
//		// 2
//		int[] e2 = new int[4];
//		System.out.println(e2[0]);
//		
		System.out.println(str);
		
		
	}

}

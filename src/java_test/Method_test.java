package java_test;

public class Method_test {

	int i;
	String s;
	boolean b;
	
	static int si;
    static String ss;

	public static void main(String[] args) {

		Method_test mt = new Method_test();
//		String s="안녕하세요";
//		
//		System.out.println(mt.i);
//		System.out.println(mt.s);
//		System.out.println(s);
//		System.out.println(si);
//		System.out.println(ss);
		
		Method_test[] mtt = new Method_test[4]; //Method_test 배열 mtt에는 Method_test 밖에 오지 못한다.
		                                        //이유는 int[]인 배열은 안에 int값 밖에 못오기 때문이다.
		mtt[0] =  new Method_test();
		mtt[1] =  mt;
		System.out.println(mtt[0]); // Method_test 이름과 주소를 출력해준다.
		System.out.println(mtt[0].s);
		/////////////////////////////////////////////////
		
		int[] iarray = new int[4];
//		
		
		iarray[0] = 1;
		iarray[0] = new int();
//		System.out.println(iarray[0]);
//		
		

	}

}

public class T200228 {
	public static void main1(String[] args) {
		int a = 10;
		System.out.println(a);
		a = 99;
		System.out.println(a);
		System.out.println("=============");
		final int SIZE = 200;
		//SIZE = 100; error
		System.out.println(SIZE);

		final int SIZE2;
		SIZE2 = 100;
		//SIZE2 = 3300;error
		System.out.println(SIZE2);
	}

	public static void main2(String[] args) {
		//在屏幕上打印出   "hello"  \  ->转义  \"==>"
		String s = "\\hello\\";
		System.out.println(s);
	}

	public static void main(String[] args) {
		//字节类型   byte   1  -2^7  -  2^7-1
		//-128   127
		//
		//总结来说，给变量赋值的时候，赋值的值不能够超过
		//其能够表达的范围
		
		byte b = 127;
		System.out.println(b);

		//如果进行直接赋值，就是把一个越界的数字给对应的类型
		//这种情况下会报错。
		int c = 214748364;
		System.out.println(c);

		int a = Integer.MAX_VALUE+1;
		System.out.println(a);
		System.out.println(Integer.MAX_VALUE+1);
	}
}
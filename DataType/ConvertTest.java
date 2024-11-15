//类型转换测试题

public class ConvertTest{
	public static void main(String[] args){
		// short s1 = 12;
		// s1 = s1 - 9;
		// System.out.println("s1" = s1);	//从int转换到short可能会有损失

		byte b1 = 10;
		//b1 = b1 + 11;   // 从int转换到byte可能会有损失
		b1 = (byte)(b1+11);
		System.out.println("b1 = " + b1);

		char c = 'a';
		int i = 16;
		float d = .314f;
		double result = c + i +d;
		System.out.println("result =" + result);

		// byte b = 16;
		// short s =14;
		// short t =s+b;   //从int转换到short可能会有损失
		// System.out.println("t = " + t);
	}
}
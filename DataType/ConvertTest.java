//����ת��������

public class ConvertTest{
	public static void main(String[] args){
		// short s1 = 12;
		// s1 = s1 - 9;
		// System.out.println("s1" = s1);	//��intת����short���ܻ�����ʧ

		byte b1 = 10;
		//b1 = b1 + 11;   // ��intת����byte���ܻ�����ʧ
		b1 = (byte)(b1+11);
		System.out.println("b1 = " + b1);

		char c = 'a';
		int i = 16;
		float d = .314f;
		double result = c + i +d;
		System.out.println("result =" + result);

		// byte b = 16;
		// short s =14;
		// short t =s+b;   //��intת����short���ܻ�����ʧ
		// System.out.println("t = " + t);
	}
}
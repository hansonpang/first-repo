//STring����ת���ɻ�����������
public class StringToBasic{
	public static void main(String[] args){
		//
		String s1 = "123";
		short num1 = Short.parseShort(s1);
		System.out.println("num1 =" + num1);

		long num2 = Long.parseLong(s1);
		System.out.println("num2 =" + num2);

		int num3 = Integer.parseInt(s1);
		System.out.println("num3 =" + num3);

		float num4 = Float.parseFloat(s1);
		System.out.println("num4 =" + num4);

		double num5 = Double.parseDouble(s1);
		System.out.println("num5 =" + num5);

		boolean b1 = Boolean.parseBoolean("true");
		System.out.println("b1 =" + b1);

		byte num6 = Byte.parseByte(s1);
		System.out.println("num6 =" + num6);

		//�ַ���ת���ַ�char ����>������  �õ��ַ�����һ���ַ�
		char c1 = s1.charAt(0);    //0�����һλ
		System.out.println("c1 =" + c1);

	}
}
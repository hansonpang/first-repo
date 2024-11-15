//STring类型转换成基本数据类型
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

		//字符串转成字符char ——>含义是  得到字符串的一个字符
		char c1 = s1.charAt(0);    //0代表第一位
		System.out.println("c1 =" + c1);

	}
}
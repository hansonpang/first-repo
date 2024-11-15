//基本数据类型转String
public class BasicToString{
	public static void main(String[] args){
		int n1 = 100;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		System.out.println("s1 = " + s1);
		String s2 = f1 + "";
		System.out.println("s2 = " + s2);
		String s3 = d1 + "";
		System.out.println("s3 = " + s3);
		String s4 = b1 + "";
		System.out.println("s4 = " + s4);
	}
}
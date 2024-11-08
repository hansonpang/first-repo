//测试浮点型变量

public class FloatDetail{
	public static void main(String[] args){
		double n1 = 1.3;
		//float n2 = 1.1;   错误: 不兼容的类型: 从double转换到float可能会有损失
		float n2 = 1.1F;
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);

		//通常情况下，应该使用double型，因为它比float型更精确
		double n3 = 3.12345678910;
		float  n4 = 3.12345678910F;
		System.out.println("n3 = " + n3);
		System.out.println("n4 = " + n4);

		//浮点使用陷阱
		double num1 = 2.7;
		double num2 = 8.1 / 3;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);  //接近2.7的小数，而不是2.7

		if (num1 == num2){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}

		if (Math.abs(num1 -num2) < 0.000001){
			System.out.println("差值非常小，到我的规定精度，认为相等。。。。");
		}
		else{
			System.out.println("认为不相等");
		}
		System.out.println(Math.abs(num1 - num2));
	}
}
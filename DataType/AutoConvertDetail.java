//测试数据自动转换
public class AutoConvertDetail{
	public static void main(String[] args){
// 		1.有多种类型的数据混合运算是，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。
		int n1 = 10; //ok
		//float d1 = n1 + 1.1; //错，n1 + 1.1 => 结果类型是double
		//double d1 = n1 + 1.1 //对
		float d1 = n1 + 1.1F;

// 		2.当我们把精度（容量）大 的数据类型赋值给精度（容量）小的数据时，就会报错，反之就会进行自动类型转换。
		//int n2 = 1.1; //错，double>int

		//byte,short和char之间不会相互自动转换。
		//当把具体数赋给byte时，先判断该数是否在byte范围内，如果是就可以
		byte b1 = 10;

		//如果是变量赋值，则判断类型。
		//int n2 = 1;
		//byte b2 = n2; //错误
	}
}
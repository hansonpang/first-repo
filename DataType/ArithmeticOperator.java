//测试算术运算符
public class ArithmeticOperator{
	public static void main(String[] args){
		// /使用
		System.out.println(10/4);  //从数学来看是2.5，java中是2
		System.out.println(10.0/4); //java是2.5
		double d = 10/4;  //java中10/4=2   2>2.0
		System.out.println("d = " + d);  


		//取模，取余
		//%的本质是 a%b = a-a/b*b

		System.out.println( 10 % 3);  // 1
		System.out.println(-10 % 3); //(-10)-(-10)/3*3=(-10)-(-9)=-1
		System.out.println(10 % -3); //10-10/(-3)*(-3)=10-9=1
		System.out.println(-10 % -3); //(-10)-(-10)/(-3)*(-3)=-10-(-9)=-1

		/*
		++ 作为表达式使用：
		前++：++i  先自增后赋值
		后++： i++ 先赋值后自增
		*/
		int j = 8;
		int k = ++j;  //k =9,j=9
		int m = 8;
		int i = m++;  //i=8,m=9
		System.out.println("==============================");
		System.out.println("k=" + k + '\n' + "j=" + j);
		System.out.println("==============================");
		System.out.println("i=" + i + '\n' + "m=" + m);

		System.out.println("==============================");
		int i1=1;
		i1=i1++;   // (1)temp=i;(2)i=i+1;(3)i=temp;
		System.out.println("i1 = " + i1);    //i=1

		int i2 = 1;
		i2 = ++i2;    // (1)i=i+1;(2)temp=i;(3)i=temp;
		System.out.println("i2 = " + i2);


		System.out.println("==============================");
		/*
		1.假如还有59天放假，问：合xx个星期，零xxx天
		*/
		int a1,a2;
		a1 = 59 / 7;
		a2 = 59 % 7;
		System.out.println("合" + a1 + "个星期，零" + a2 + "天");

		System.out.println("==============================");
		/*
		2.定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100)，请求出华氏温度对应的摄氏温度。【234.5】
		*/
		double a3;
		a3 = 5.0 / 9 * (234.5 -100);
		System.out.println("234.5华氏温度对应的摄氏温度为" + a3);
	}
}
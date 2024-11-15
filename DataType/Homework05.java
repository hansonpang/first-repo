//逻辑运算符练习题
public class Homework05{
	public static void main(String[] args){
		System.out.println("第一题：逻辑与");
		int x1 =5;
		int x2 =5;
		if(x1++ == 6 & ++x2 == 6){
			x1 = 11;
		}
		System.out.println("x1 = " + x1 + ", x2 =" + x2);
		System.out.println("====================================");

		System.out.println("第二题：短路与");
		int x3 =5;
		int x4 =5;
		if(x3++ == 6 && ++x4 == 6){
			x3 = 11;
		}
		System.out.println("x3 = " + x3 + ", x4 =" + x4);
		System.out.println("====================================");

		System.out.println("第三题：逻辑或");
		int x5 =5;
		int x6 =5;
		if(x5++ == 6 | ++x6 == 6){
			x5 = 11;
		}
		System.out.println("x5 = " + x5 + ", x6 =" + x6);
		System.out.println("====================================");

		System.out.println("第四题：短路或");
		int x7 =5;
		int x8 =5;
		if(x7++ == 6 || ++x8 == 6){
			x7 = 11;
		}
		System.out.println("x7 = " + x7 + ", x8 =" + x8);
		System.out.println("====================================");


		System.out.println("第五题：");
		boolean a = true;
		boolean b = false;
		short z = 46;
		if((z++ == 46)&& (b = true)){
			z++;
		}
		if((a=false) || (++z == 49)){
			z++;
		}
		System.out.println("z = " + z);
	}
}
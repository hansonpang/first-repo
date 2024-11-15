//接收键盘输入

//1.引入Scanner类所在的包
import java.util.Scanner;
public class input{
	public static void main(String[] args){
		
		//2.创建Scanner对象，
		Scanner myScanner = new Scanner(System.in);

		//3.使用相关方法，接收用户输入的内容
		System.out.println("请输入名字：");
		String name = myScanner.next();    //接收用户输入的字符串
		System.out.println("请输入年龄：");
		int age = myScanner.nextInt();     //接收用户输入的int
		System.out.println("请输入薪水：");
		double sal = myScanner.nextDouble();  //接收用户输入double
		System.out.println(name + "的信息如下：");
		System.out.println("名字：" + name + '\n' + "年龄：" + age + '\n' + "薪水" + sal);
	}
}
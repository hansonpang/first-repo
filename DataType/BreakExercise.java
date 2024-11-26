//break练习题
import java.util.Scanner;
public class BreakExercise{
	public static void main(String[] args){
		//练习1
		// int sum=0,num=0;
		// for(int i =1;i<=100;i++){
		// 	sum = sum + i;
		// 	if(sum > 20){
		// 		break;
		// 	}
		// 	System.out.println("sum = " + sum);
		// }

		// System.out.println("最终结果sum = " + sum);


		//练习2

		String name = "",password = "";
		Scanner myScanner = new Scanner(System.in);
		for(int i =1;i<=3;i++){
			System.out.println("请输入用户名： ");
			name = myScanner.next();
			System.out.println(name);

			System.out.println("请输入密码： ");
			password = myScanner.next();
			System.out.println(password);

			if((name.equals("丁真")&&("666".equals(password))){
				System.out.println("登录成功！");
				break;
			}

			if(i == 3){
				System.out.println("登录失败!!!");
			}
			else{
				System.out.println("登录失败，还有 " + (3-i)+ " 次机会！");
			}
			
		}
		

	}
}
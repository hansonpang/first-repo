//Return练习
import java.util.Scanner;
public class ReturnExercise{
	public static void main(String[] args){
		// int a=0,b=100000;
		// while(b>50000){
		// 	b = b * ((100 - 5)/100);
		// 	a++;
		// 	if(b<=50000){
		// 		break;
		// 	}
		// }


		// while((b<=50000)&&(b>0)){
		// 	b = b - 1000;
		// 	if(b<0){
		// 		break;
		// 	}
		// 	a++;
		// }

		// double money = 100000;
		// int count = 0;
		// while(true){
		// 	if(money>50000){
		// 		money *= 0.95;
		// 		count++;
		// 	}else if(money >= 1000){
		// 		money -=1000;
		// 		count++;
		// 	}else{
		// 		break;
		// 	}
		// }

		// System.out.println("100000 可以通过  " + count + " 个路口！" );

		Scanner myScanner = new Scanner(System.in);
		
		// int a;
		// System.out.println("请输入一个整数：");
		// a = myScanner.nextInt();
		// if(a>0){
		// 	System.out.println("输入的整数：" + a + "  大于0");
		// }
		// else if(a == 0){
		// 	System.out.println("输入的整数：" + a + "  等于0");
		// }
		// else if(a < 0){
		// 	System.out.println("输入的整数：" + a + "  小于0");
		// }
		// else{
		// 	System.out.println("输入错误！");
		// }


		//int b= 100;
		//System.out.println("请输入一个三位数的整数：");
		//b = myScanner.nextInt();
		// int count = 0;
			
		
		// for(int b = 100;b<1000;b++){
		// 	// if(b / 1000 < 1 && b/100>=1){
		// 		int x1 = b/100;
		// 		int x2 = (b - x1 * 100)/10;
		// 		int x3 = b - x1 * 100 - x2 * 10;
				
		// 		int x4 = x1*x1*x1 + x2*x2*x2 + x3*x3*x3;
				
		// 		if(b == x4){
		// 			System.out.println("x1 = " + x1 + " ,x2 = " + x2 + " ,x3 = " + x3);
		// 			System.out.println("x4 = " + x4);

		// 			// System.out.println("该整数为水仙花数！");
		// 			System.out.println("整数"+ b +"为水仙花数！");
		// 			System.out.println("======================================");
		// 			count++;
		// 		}
		// 		// else{
		// 		// 	System.out.println("该整数不是水仙花数！");
		// 		// }
		// 	// }
		// 	// else{
		// 	// 	System.out.println("输入错误！");
		// 	// }
		// }

		// System.out.println("水仙花数一共有 "+ count + " 个！");




		//练习4
		// int count = 0;
		// for(int i = 1;i<=100;i++){
		// 	if(i%5 == 0){
		// 		count++;
		// 		System.out.print(i + "  ");

		// 		if(count % 5 == 0){
		// 			System.out.println();
		// 			count =0;
		// 		}
		// 	}
		// }




		//练习5
		// char c1 ='a',c2='A';
		// //char a1,b1;
		// for(;c1<=122;c1++){
		// 	System.out.print(c1 + "  ");
			
		// }

		// System.out.println();

		// for(;c2<=90;c2++){
			
		// 	System.out.print(c2 + "  ");
		// }



		//练习6
		// double sum =0,b;
		// for(int i = 1;i <= 100;i++){
		// 	b=1.0/i;
		// 	if(i%2==0){
				
		// 		sum = sum - b;
		// 		System.out.println("当前sum =  " + sum);
		// 	}
		// 	else{
		// 		sum = sum + b;
		// 		System.out.println("当前sum =  " + sum);
		// 	}
		// }
		// System.out.println("==================================== ");
		// System.out.println("和为 " + sum);


		//练习7
		int sum =0;
		for(int i = 1;i<=100;i++){
			for(int j =1;j<=i;j++){
				sum += j;
			}
		}
		System.out.println("sum = " + sum);
		
	}
}
//测试if else
import java.util.Scanner;
public class IfElseOperation{
	public static void main(String[] args){
		//测试1
		 Scanner myScanner = new Scanner(System.in);
		// double d1,d2,sum;
		// System.out.println("请输入d1:");
		// d1 = myScanner.nextDouble();
		// System.out.println("请输入d2:");
		// d2 = myScanner.nextDouble();

		// if (d1 > 10.0 && d2 < 20.0){
		// 	sum = d1 + d2;
		// 	System.out.println("d1 + d2 = " + sum);
		// }

		//测试2
		// int a1,a2,sum;
		// System.out.println("请输入a1:");
		// a1 = myScanner.nextInt();
		// System.out.println("请输入a2:");
		// a2 = myScanner.nextInt();

		// sum = a1 + a2;

		// if ((sum % 3 == 0) && (sum % 5 == 0)){
		// 	System.out.println("sum = " + sum + "   a1与a2的和既能被3整除，又能被5整除");
		// }
		// else if((sum % 3 != 0) && (sum % 5 == 0)){
		// 	System.out.println("sum = " + sum + "   a1与a2的和不能被3整除，但能被5整除");
		// }
		// else if((sum % 3 == 0) && (sum % 5 != 0)){
		// 	System.out.println("sum = " + sum + "   a1与a2的和能被3整除，但不能被5整除");
		// }
		// else{
		// 	System.out.println("sum = " + sum + "   a1与a2的和既不能被3整除，又不能被5整除");
		// }


		//测试3
		 // int year;
		 // System.out.println("请输入年份：");
		 // year = myScanner.nextInt();
		 // if(((year % 4 ==0) && (year % 100 != 0)) || (year % 400 == 0)){
		 // 	System.out.println(year + "是闰年！");
		 // }
		 // else{
		 // 	System.out.println(year + "不是闰年！");
		 // }

		 //测试4
		//  int score;
		//  System.out.println("请输入保国同志的芝麻信用分： ");
		//  score = myScanner.nextInt();
		//  if((score >= 1) && (score <= 100)){
		// 	 	if(score == 100){
		// 	 	System.out.println("保国同志信用良好！： ");
		// 	 }
		// 	 else if((score > 80) && (score <= 99)){
		// 	 	System.out.println("保国同志信用优秀！： ");
		// 	 }
		// 	 else if((score > 60) && (score <= 80)){
		// 	 	System.out.println("保国同志信用一般！： ");
		// 	 }
		// 	 else{
		//  		System.out.println("保国同志信用不合格！： ");
		//  	 }
		// }		 
		//  else{
		//  	System.out.println("信用分需要再1-100，请重新输入： ");
		//  }


		//测试5 嵌套分支测试
		// double score;
		// char gender;
		// System.out.println("请输入初赛分数：");
		// score = myScanner.nextDouble();
		// if((score > 0.0)&&(score < 100.0)){
		// 	if(score > 8.0){
		// 		System.out.println("请输入性别：");
		// 		gender = myScanner.next().charAt(0);
		// 		if(gender == '男'){
		// 			System.out.println("恭喜进入决赛男子组！");
		// 		}
		// 		else if(gender == '女'){
		// 			System.out.println("恭喜进入决赛女子组！");
		// 		}
		// 		else{
		// 			System.out.println("性别输入错误，请重新输入！");
		// 		}
		// 	}
		// 	else{
		// 		System.out.println("未通过初赛！");
		// 	}
		// }
		// else{
		// 	System.out.println("输入分数错误，请重新输入！");
		// }


		//测试6 
		// int month; //月份
		// int age;   //年龄
		// System.out.println("请输入当前月份(1~12)：");
		// month = myScanner.nextInt();
		// if((month >= 4) && (month <= 10)){
		// 	System.out.println("请输入年龄(1~200)：");
		// 	age = myScanner.nextInt();
		// 	if((age >= 1)&&(age < 18)){
		// 		System.out.println("========================================================");
		// 		System.out.println("当前为旺季，年龄=" + age + "，为儿童" + '\n' +"儿童票价为：30");
		// 	}
		// 	else if((age>=18)&&(age <=60)){
		// 		System.out.println("成人票价为：60");
		// 	}
		// 	else if((age>=60)&&(age <= 200)){
		// 		System.out.println("老人票价为：20");
		// 	}
		// 	else{
		// 		System.out.println("年龄输入错误，请重新输入！");
		// 	}
		// }
		// else if(((month >=1)&&(month <= 3)) || ((month>=11)&& (month <= 12))){
		// 	System.out.println("请输入年龄(1~200)：");
		// 	age = myScanner.nextInt();
		// 	if((age>=18)&&(age <=60)){
		// 		System.out.println("成人票价为：60");
		// 	}
		// 	else if(((age >= 1)&&(age < 18))||((age>=60)&&(age <= 200))){
		// 		System.out.println("儿童和老人票价为：20");
		// 	}
		// 	else{
		// 		System.out.println("年龄输入错误，请重新输入！");
		// 	}
		// }
		// else{
		// 		System.out.println("月份输入错误，请重新输入！");
		// }

		//测试7
		char c1;
		System.out.println("a表示星期一；"+ '\n' +
						   "b表示星期二；"+ '\n' +
						   "c表示星期三；"+ '\n' +
						   "d表示星期四；"+ '\n' +
						   "e表示星期五；"+ '\n' +
						   "f表示星期六；"+ '\n' +
						   "g表示星期日；");
		System.out.println("===============================================");
		System.out.println("请输入字符（a,b,c,d,e,f,g）");
		c1 = myScanner.next().charAt(0);

		switch(c1){
			case ('a') : {
				System.out.println("星期一");
				break;
			}
			case ('b') : {
				System.out.println("星期二");
				break;
			}
			case ('c') : {
				System.out.println("星期三");
				break;
			}
			case ('d') : {
				System.out.println("星期四");
				break;
			}
			case ('e') : {
				System.out.println("星期五");
				break;
			}
			case ('f') : {
				System.out.println("星期六");
				break;
			}
			case ('g') : {
				System.out.println("星期日");
				break;
			}
			default : {
				System.out.println("输入错误，请重新输入");
				break;
			}
		}

	}
}
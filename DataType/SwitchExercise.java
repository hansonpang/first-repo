//Switch练习
import java.util.Scanner;
public class SwitchExercise{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);

		//测试1
		// char c1;
		// System.out.println("输入小写字母（a,b,c,d)：");
		// c1 = myScanner.next().charAt(0);
		// switch (c1) {
		// 	case 'a' : {
		// 		System.out.println("A");
		// 		break;
		// 	}
		// 	case 'b' : {
		// 		System.out.println("B");
		// 		break;
		// 	}
		// 	case 'c' : {
		// 		System.out.println("C");
		// 		break;
		// 	}
		// 	case 'd' : {
		// 		System.out.println("D");
		// 		break;
		// 	}
		// 	default : {
		// 		System.out.println("输入错误，请重新输入！");
		// 		break;
		// 	}
		// }

		//测试2
		// int score; //分数
		// System.out.println("输入成绩：");
		// score = myScanner.nextInt();
		// if((score>=0) && (score<=100)){
		// 	switch (score/60) {
		// 		case 0 : 
		// 			System.out.println("不合格！");
		// 			break;
		// 		case 1 :
		// 			System.out.println("合格！");
		// 			break;
		// 		// default :
		// 		// 	System.out.println("输入错误！");
		// 		// 	break;

		// 		}
		// }
		// else{
		// 	System.out.println("输入错误！");
		// }

		//测试3
		int month;
		System.out.println("输入月份（1-12）：");
		month = myScanner.nextInt();
		//if((month >= 1)&&(month <= 12)){
			switch (month) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("这是春季！");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("这是夏季！");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("这是秋季！");
				break;
			case 12 :
			case 1 :
			case 2 :
				System.out.println("这是冬季！");
				break;
			default : {
				System.out.println("输入错误！");
			}

			}
		//}
		//else{
		//	System.out.println("输入错误！");
		//}
		




	}
}
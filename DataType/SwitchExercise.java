//Switch��ϰ
import java.util.Scanner;
public class SwitchExercise{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);

		//����1
		// char c1;
		// System.out.println("����Сд��ĸ��a,b,c,d)��");
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
		// 		System.out.println("����������������룡");
		// 		break;
		// 	}
		// }

		//����2
		// int score; //����
		// System.out.println("����ɼ���");
		// score = myScanner.nextInt();
		// if((score>=0) && (score<=100)){
		// 	switch (score/60) {
		// 		case 0 : 
		// 			System.out.println("���ϸ�");
		// 			break;
		// 		case 1 :
		// 			System.out.println("�ϸ�");
		// 			break;
		// 		// default :
		// 		// 	System.out.println("�������");
		// 		// 	break;

		// 		}
		// }
		// else{
		// 	System.out.println("�������");
		// }

		//����3
		int month;
		System.out.println("�����·ݣ�1-12����");
		month = myScanner.nextInt();
		//if((month >= 1)&&(month <= 12)){
			switch (month) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("���Ǵ�����");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("�����ļ���");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("�����＾��");
				break;
			case 12 :
			case 1 :
			case 2 :
				System.out.println("���Ƕ�����");
				break;
			default : {
				System.out.println("�������");
			}

			}
		//}
		//else{
		//	System.out.println("�������");
		//}
		




	}
}
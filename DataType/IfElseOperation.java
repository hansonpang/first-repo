//����if else
import java.util.Scanner;
public class IfElseOperation{
	public static void main(String[] args){
		//����1
		 Scanner myScanner = new Scanner(System.in);
		// double d1,d2,sum;
		// System.out.println("������d1:");
		// d1 = myScanner.nextDouble();
		// System.out.println("������d2:");
		// d2 = myScanner.nextDouble();

		// if (d1 > 10.0 && d2 < 20.0){
		// 	sum = d1 + d2;
		// 	System.out.println("d1 + d2 = " + sum);
		// }

		//����2
		// int a1,a2,sum;
		// System.out.println("������a1:");
		// a1 = myScanner.nextInt();
		// System.out.println("������a2:");
		// a2 = myScanner.nextInt();

		// sum = a1 + a2;

		// if ((sum % 3 == 0) && (sum % 5 == 0)){
		// 	System.out.println("sum = " + sum + "   a1��a2�ĺͼ��ܱ�3���������ܱ�5����");
		// }
		// else if((sum % 3 != 0) && (sum % 5 == 0)){
		// 	System.out.println("sum = " + sum + "   a1��a2�ĺͲ��ܱ�3���������ܱ�5����");
		// }
		// else if((sum % 3 == 0) && (sum % 5 != 0)){
		// 	System.out.println("sum = " + sum + "   a1��a2�ĺ��ܱ�3�����������ܱ�5����");
		// }
		// else{
		// 	System.out.println("sum = " + sum + "   a1��a2�ĺͼȲ��ܱ�3�������ֲ��ܱ�5����");
		// }


		//����3
		 // int year;
		 // System.out.println("��������ݣ�");
		 // year = myScanner.nextInt();
		 // if(((year % 4 ==0) && (year % 100 != 0)) || (year % 400 == 0)){
		 // 	System.out.println(year + "�����꣡");
		 // }
		 // else{
		 // 	System.out.println(year + "�������꣡");
		 // }

		 //����4
		//  int score;
		//  System.out.println("�����뱣��ͬ־��֥�����÷֣� ");
		//  score = myScanner.nextInt();
		//  if((score >= 1) && (score <= 100)){
		// 	 	if(score == 100){
		// 	 	System.out.println("����ͬ־�������ã��� ");
		// 	 }
		// 	 else if((score > 80) && (score <= 99)){
		// 	 	System.out.println("����ͬ־�������㣡�� ");
		// 	 }
		// 	 else if((score > 60) && (score <= 80)){
		// 	 	System.out.println("����ͬ־����һ�㣡�� ");
		// 	 }
		// 	 else{
		//  		System.out.println("����ͬ־���ò��ϸ񣡣� ");
		//  	 }
		// }		 
		//  else{
		//  	System.out.println("���÷���Ҫ��1-100�����������룺 ");
		//  }


		//����5 Ƕ�׷�֧����
		// double score;
		// char gender;
		// System.out.println("���������������");
		// score = myScanner.nextDouble();
		// if((score > 0.0)&&(score < 100.0)){
		// 	if(score > 8.0){
		// 		System.out.println("�������Ա�");
		// 		gender = myScanner.next().charAt(0);
		// 		if(gender == '��'){
		// 			System.out.println("��ϲ������������飡");
		// 		}
		// 		else if(gender == 'Ů'){
		// 			System.out.println("��ϲ�������Ů���飡");
		// 		}
		// 		else{
		// 			System.out.println("�Ա�����������������룡");
		// 		}
		// 	}
		// 	else{
		// 		System.out.println("δͨ��������");
		// 	}
		// }
		// else{
		// 	System.out.println("��������������������룡");
		// }


		//����6 
		// int month; //�·�
		// int age;   //����
		// System.out.println("�����뵱ǰ�·�(1~12)��");
		// month = myScanner.nextInt();
		// if((month >= 4) && (month <= 10)){
		// 	System.out.println("����������(1~200)��");
		// 	age = myScanner.nextInt();
		// 	if((age >= 1)&&(age < 18)){
		// 		System.out.println("========================================================");
		// 		System.out.println("��ǰΪ����������=" + age + "��Ϊ��ͯ" + '\n' +"��ͯƱ��Ϊ��30");
		// 	}
		// 	else if((age>=18)&&(age <=60)){
		// 		System.out.println("����Ʊ��Ϊ��60");
		// 	}
		// 	else if((age>=60)&&(age <= 200)){
		// 		System.out.println("����Ʊ��Ϊ��20");
		// 	}
		// 	else{
		// 		System.out.println("��������������������룡");
		// 	}
		// }
		// else if(((month >=1)&&(month <= 3)) || ((month>=11)&& (month <= 12))){
		// 	System.out.println("����������(1~200)��");
		// 	age = myScanner.nextInt();
		// 	if((age>=18)&&(age <=60)){
		// 		System.out.println("����Ʊ��Ϊ��60");
		// 	}
		// 	else if(((age >= 1)&&(age < 18))||((age>=60)&&(age <= 200))){
		// 		System.out.println("��ͯ������Ʊ��Ϊ��20");
		// 	}
		// 	else{
		// 		System.out.println("��������������������룡");
		// 	}
		// }
		// else{
		// 		System.out.println("�·�����������������룡");
		// }

		//����7
		char c1;
		System.out.println("a��ʾ����һ��"+ '\n' +
						   "b��ʾ���ڶ���"+ '\n' +
						   "c��ʾ��������"+ '\n' +
						   "d��ʾ�����ģ�"+ '\n' +
						   "e��ʾ�����壻"+ '\n' +
						   "f��ʾ��������"+ '\n' +
						   "g��ʾ�����գ�");
		System.out.println("===============================================");
		System.out.println("�������ַ���a,b,c,d,e,f,g��");
		c1 = myScanner.next().charAt(0);

		switch(c1){
			case ('a') : {
				System.out.println("����һ");
				break;
			}
			case ('b') : {
				System.out.println("���ڶ�");
				break;
			}
			case ('c') : {
				System.out.println("������");
				break;
			}
			case ('d') : {
				System.out.println("������");
				break;
			}
			case ('e') : {
				System.out.println("������");
				break;
			}
			case ('f') : {
				System.out.println("������");
				break;
			}
			case ('g') : {
				System.out.println("������");
				break;
			}
			default : {
				System.out.println("�����������������");
				break;
			}
		}

	}
}
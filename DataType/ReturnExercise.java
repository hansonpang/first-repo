//Return��ϰ
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

		// System.out.println("100000 ����ͨ��  " + count + " ��·�ڣ�" );

		Scanner myScanner = new Scanner(System.in);
		
		// int a;
		// System.out.println("������һ��������");
		// a = myScanner.nextInt();
		// if(a>0){
		// 	System.out.println("�����������" + a + "  ����0");
		// }
		// else if(a == 0){
		// 	System.out.println("�����������" + a + "  ����0");
		// }
		// else if(a < 0){
		// 	System.out.println("�����������" + a + "  С��0");
		// }
		// else{
		// 	System.out.println("�������");
		// }


		//int b= 100;
		//System.out.println("������һ����λ����������");
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

		// 			// System.out.println("������Ϊˮ�ɻ�����");
		// 			System.out.println("����"+ b +"Ϊˮ�ɻ�����");
		// 			System.out.println("======================================");
		// 			count++;
		// 		}
		// 		// else{
		// 		// 	System.out.println("����������ˮ�ɻ�����");
		// 		// }
		// 	// }
		// 	// else{
		// 	// 	System.out.println("�������");
		// 	// }
		// }

		// System.out.println("ˮ�ɻ���һ���� "+ count + " ����");




		//��ϰ4
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




		//��ϰ5
		// char c1 ='a',c2='A';
		// //char a1,b1;
		// for(;c1<=122;c1++){
		// 	System.out.print(c1 + "  ");
			
		// }

		// System.out.println();

		// for(;c2<=90;c2++){
			
		// 	System.out.print(c2 + "  ");
		// }



		//��ϰ6
		// double sum =0,b;
		// for(int i = 1;i <= 100;i++){
		// 	b=1.0/i;
		// 	if(i%2==0){
				
		// 		sum = sum - b;
		// 		System.out.println("��ǰsum =  " + sum);
		// 	}
		// 	else{
		// 		sum = sum + b;
		// 		System.out.println("��ǰsum =  " + sum);
		// 	}
		// }
		// System.out.println("==================================== ");
		// System.out.println("��Ϊ " + sum);


		//��ϰ7
		int sum =0;
		for(int i = 1;i<=100;i++){
			for(int j =1;j<=i;j++){
				sum += j;
			}
		}
		System.out.println("sum = " + sum);
		
	}
}
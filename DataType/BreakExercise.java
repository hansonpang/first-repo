//break��ϰ��
import java.util.Scanner;
public class BreakExercise{
	public static void main(String[] args){
		//��ϰ1
		// int sum=0,num=0;
		// for(int i =1;i<=100;i++){
		// 	sum = sum + i;
		// 	if(sum > 20){
		// 		break;
		// 	}
		// 	System.out.println("sum = " + sum);
		// }

		// System.out.println("���ս��sum = " + sum);


		//��ϰ2

		String name = "",password = "";
		Scanner myScanner = new Scanner(System.in);
		for(int i =1;i<=3;i++){
			System.out.println("�������û����� ");
			name = myScanner.next();
			System.out.println(name);

			System.out.println("���������룺 ");
			password = myScanner.next();
			System.out.println(password);

			if((name.equals("����")&&("666".equals(password))){
				System.out.println("��¼�ɹ���");
				break;
			}

			if(i == 3){
				System.out.println("��¼ʧ��!!!");
			}
			else{
				System.out.println("��¼ʧ�ܣ����� " + (3-i)+ " �λ��ᣡ");
			}
			
		}
		

	}
}
//���ռ�������

//1.����Scanner�����ڵİ�
import java.util.Scanner;
public class input{
	public static void main(String[] args){
		
		//2.����Scanner����
		Scanner myScanner = new Scanner(System.in);

		//3.ʹ����ط����������û����������
		System.out.println("���������֣�");
		String name = myScanner.next();    //�����û�������ַ���
		System.out.println("���������䣺");
		int age = myScanner.nextInt();     //�����û������int
		System.out.println("������нˮ��");
		double sal = myScanner.nextDouble();  //�����û�����double
		System.out.println(name + "����Ϣ���£�");
		System.out.println("���֣�" + name + '\n' + "���䣺" + age + '\n' + "нˮ" + sal);
	}
}
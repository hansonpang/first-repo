//�������������
public class ArithmeticOperator{
	public static void main(String[] args){
		// /ʹ��
		System.out.println(10/4);  //����ѧ������2.5��java����2
		System.out.println(10.0/4); //java��2.5
		double d = 10/4;  //java��10/4=2   2>2.0
		System.out.println("d = " + d);  


		//ȡģ��ȡ��
		//%�ı����� a%b = a-a/b*b

		System.out.println( 10 % 3);  // 1
		System.out.println(-10 % 3); //(-10)-(-10)/3*3=(-10)-(-9)=-1
		System.out.println(10 % -3); //10-10/(-3)*(-3)=10-9=1
		System.out.println(-10 % -3); //(-10)-(-10)/(-3)*(-3)=-10-(-9)=-1

		/*
		++ ��Ϊ���ʽʹ�ã�
		ǰ++��++i  ��������ֵ
		��++�� i++ �ȸ�ֵ������
		*/
		int j = 8;
		int k = ++j;  //k =9,j=9
		int m = 8;
		int i = m++;  //i=8,m=9
		System.out.println("==============================");
		System.out.println("k=" + k + '\n' + "j=" + j);
		System.out.println("==============================");
		System.out.println("i=" + i + '\n' + "m=" + m);

		System.out.println("==============================");
		int i1=1;
		i1=i1++;   // (1)temp=i;(2)i=i+1;(3)i=temp;
		System.out.println("i1 = " + i1);    //i=1

		int i2 = 1;
		i2 = ++i2;    // (1)i=i+1;(2)temp=i;(3)i=temp;
		System.out.println("i2 = " + i2);


		System.out.println("==============================");
		/*
		1.���绹��59��ż٣��ʣ���xx�����ڣ���xxx��
		*/
		int a1,a2;
		a1 = 59 / 7;
		a2 = 59 % 7;
		System.out.println("��" + a1 + "�����ڣ���" + a2 + "��");

		System.out.println("==============================");
		/*
		2.����һ���������滪���¶ȣ������¶�ת�������¶ȵĹ�ʽΪ��5/9*(�����¶�-100)������������¶ȶ�Ӧ�������¶ȡ���234.5��
		*/
		double a3;
		a3 = 5.0 / 9 * (234.5 -100);
		System.out.println("234.5�����¶ȶ�Ӧ�������¶�Ϊ" + a3);
	}
}
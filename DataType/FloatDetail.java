//���Ը����ͱ���

public class FloatDetail{
	public static void main(String[] args){
		double n1 = 1.3;
		//float n2 = 1.1;   ����: �����ݵ�����: ��doubleת����float���ܻ�����ʧ
		float n2 = 1.1F;
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);

		//ͨ������£�Ӧ��ʹ��double�ͣ���Ϊ����float�͸���ȷ
		double n3 = 3.12345678910;
		float  n4 = 3.12345678910F;
		System.out.println("n3 = " + n3);
		System.out.println("n4 = " + n4);

		//����ʹ������
		double num1 = 2.7;
		double num2 = 8.1 / 3;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);  //�ӽ�2.7��С����������2.7

		if (num1 == num2){
			System.out.println("���");
		}else{
			System.out.println("�����");
		}

		if (Math.abs(num1 -num2) < 0.000001){
			System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ���Ϊ��ȡ�������");
		}
		else{
			System.out.println("��Ϊ�����");
		}
		System.out.println(Math.abs(num1 - num2));
	}
}
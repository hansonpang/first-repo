//����������е������
public class TernaryOperatorExercise{
	public static void main(String[] args){
		int a = 10;
		int b = 100;
		int c = 50;
		int max1 = a > b ? a : b;
		int max2 = max1 > c ? max1 : c;
		System.out.println("a , b , c ��������Ϊ�� " + max2);

	}
}
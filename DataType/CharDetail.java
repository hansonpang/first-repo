//Charϸ��
public class CharDetail{
	public static void main(String[] args){
		System.out.println("test Char Detail");
		char c1 = 97; //97��unicode�룬��Ӧa   ��ascll������a
		System.out.println(c1); //���a

		char c2 = 'a';
		System.out.println((int)c2); //���a��Ӧ������

		//char�����ǿ��Խ�������ģ��൱��һ����������Ϊ�����ж�Ӧ��unicode��
		System.out.println('a' + 10); //���107
	}
}
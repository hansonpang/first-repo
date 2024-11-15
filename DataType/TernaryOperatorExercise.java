//输出三个数中的最大数
public class TernaryOperatorExercise{
	public static void main(String[] args){
		int a = 10;
		int b = 100;
		int c = 50;
		int max1 = a > b ? a : b;
		int max2 = max1 > c ? max1 : c;
		System.out.println("a , b , c 中最大的数为： " + max2);

	}
}
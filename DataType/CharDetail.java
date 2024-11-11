//Char细节
public class CharDetail{
	public static void main(String[] args){
		System.out.println("test Char Detail");
		char c1 = 97; //97是unicode码，对应a   即ascll码下是a
		System.out.println(c1); //输出a

		char c2 = 'a';
		System.out.println((int)c2); //输出a对应的数字

		//char类型是可以进行运算的，相当于一个整数，因为它都有对应的unicode码
		System.out.println('a' + 10); //输出107
	}
}
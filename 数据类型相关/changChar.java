//学习转义字符
public class changChar {
	//编写一个main方法
	public static void main(String[] args) {
		// \t  : 一个制表位，实现对齐的功能
		System.out.println("北京\t上海\t天津");
		// \n : 换行符
		System.out.println("jack\nsmith\nmary");
		// \\ ：一个\
		System.out.println("E:\\studyWithHan\\java");
		System.out.println("E:\\\\studyWithHan\\\\java");  //输出两个//
		// \"  ：一个”
		System.out.println("老韩说：\"学习java，有前途！\"");
		// \'  ：一个‘
		System.out.println("老韩说：\'学习java，有前途！\'");
		// \r ：一个回车 System.out.println("韩顺平教育\r北京")
		System.out.println("韩顺平教育\r北京");
		System.out.println("韩顺平教育\r\n北京");

		// 课堂练习：
		// 使用一句输出语句，达到输出如下效果
		// 书名		作者		价格		销量
		// 三国		罗贯中	120		1000
		System.out.println("书名\t作者\t价格\t销量\t\n三国\t罗贯中\t120\t1000");
	}
}
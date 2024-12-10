//顺序查找
import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
		String[] name={"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入要查询的名字：");
		String name1 = myScanner.next();
		int index = -1;

		for(int i =0; i<name.length; i++){
			if(name1.equals(name[i])){
				System.out.println("查找到" + name1);
				System.out.println("当前下标为：" + i);
				index = i;
				break;
			}
		}

		if(index == -1){
			System.out.println("未查找到  " + name1);
		}
	}
}
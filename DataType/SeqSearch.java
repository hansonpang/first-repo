//˳�����
import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
		String[] name={"��üӥ��","��ëʨ��","��������","��������"};
		Scanner myScanner = new Scanner(System.in);

		System.out.println("������Ҫ��ѯ�����֣�");
		String name1 = myScanner.next();
		int index = -1;

		for(int i =0; i<name.length; i++){
			if(name1.equals(name[i])){
				System.out.println("���ҵ�" + name1);
				System.out.println("��ǰ�±�Ϊ��" + i);
				index = i;
				break;
			}
		}

		if(index == -1){
			System.out.println("δ���ҵ�  " + name1);
		}
	}
}
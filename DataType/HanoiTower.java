//��ŵ����Ϸ
public class HanoiTower{
	public static void main(String[] args){
		Tower tower=new Tower();
		tower.move(5,'A','B','C');
	}
}

class Tower{
	//�������ͣ�a����num�㣬ͨ��b�����ƶ���c��
	public void move(int num,char a,char b,char c){
		//a��ֻ��1�㣬�����ֱ���ƶ���c����
		if(num<1){
			System.out.println("����������������룡");
		}
		else if(num == 1){
			System.out.println(a + "->" + c);
		}
		//a�����в�ֹһ�㣬��a���ϳ���������һ�����⣬��������ͨ��c���ƶ���b����Ȼ���ٽ�a����������һ���ƶ���c��,
		else{
			move(num -1,a,c,b);
			System.out.println(a + "->" +c);
			move(num - 1,b,a,c);

		}
	}
}
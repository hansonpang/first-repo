//
public class RecursionExercise02{
	public static void main(String[] args){
		Peach p = new Peach();
		int peachQua = p.peachQuantity(3,2);
		System.out.println("һ���� " + peachQua + "������");
	}
}

//����x������
// 1-9�죬ÿ���һ�룬�����һ��
//��ʮ�컹û��ʼ�� ��ֻʣһ��
class Peach{
	public int peachQuantity(int day,int a){
		if(day>1){
			
			return (peachQuantity(day-1,a)+1)*2;
		}
		else if(day == 1){
			return a;
		}
		else{
			return -1;
		}
	}
}
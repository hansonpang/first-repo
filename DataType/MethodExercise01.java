public class MethodExercise01{
	public static void main(String[] args){
		AA a = new AA();
		if(a.isOdd(2)){
			System.out.println("��������");
		}
		else{
			System.out.println("��ż����");
		}

		a.printA(10,4,'#');
	}
}

//��д��AA����һ���������ж�һ����������odd����ż��������boolean
class AA{
	public boolean isOdd(int n){
		if(n % 2 !=0){
			return true;
			//System.out.println("��������");
		}
		else{
			return false;
			//System.out.println("��ż����");
		}
	}

	//�����С��С��ַ���ӡ ��Ӧ�������������ַ�  ���磺   �У�4���У�4���ַ���#
	
	public void printA(int a,int b,char c){
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}


}


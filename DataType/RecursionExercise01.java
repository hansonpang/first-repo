
public class RecursionExercise01{
	public static void main(String[] args){
		T a = new T();
		int x = -1;
		int y = a.fibonacci(x);
		if(y == -1){
			System.out.println("����������������0��������");
		}
		else{
			System.out.println("�� " + x +" ��쳲�������= " + y);
		}
	}
}

class T{
	public int fibonacci(int f){
		if(f>0){
			if(f == 1 || f == 2){
				return 1;
			}
			else{
				return fibonacci(f-1)+fibonacci(f-2);
			}
		}
		else{
			
			return -1;
		}
		
	}
}

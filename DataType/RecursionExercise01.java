
public class RecursionExercise01{
	public static void main(String[] args){
		T a = new T();
		int x = -1;
		int y = a.fibonacci(x);
		if(y == -1){
			System.out.println("输入错误，请输入大于0的整数！");
		}
		else{
			System.out.println("第 " + x +" 个斐波那契数= " + y);
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

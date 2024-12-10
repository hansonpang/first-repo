public class MethodExercise{
	public static void main(String[] args){
		AA a = new AA();
		a.isOdd(1);
	}
}

//编写类AA，有一个方法：判断一个数是奇数odd还是偶数，返回boolean
class AA{
	public void isOdd(int n){
		if(n % 2 !=0){
			System.out.println("是奇数！");
		}
		else{
			System.out.println("是偶数！");
		}
	}
}
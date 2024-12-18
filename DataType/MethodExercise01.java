public class MethodExercise01{
	public static void main(String[] args){
		AA a = new AA();
		if(a.isOdd(2)){
			System.out.println("是奇数！");
		}
		else{
			System.out.println("是偶数！");
		}

		a.printA(10,4,'#');
	}
}

//编写类AA，有一个方法：判断一个数是奇数odd还是偶数，返回boolean
class AA{
	public boolean isOdd(int n){
		if(n % 2 !=0){
			return true;
			//System.out.println("是奇数！");
		}
		else{
			return false;
			//System.out.println("是偶数！");
		}
	}

	//根据行、列、字符打印 对应行数和列数的字符  比如：   行：4，列：4，字符：#
	
	public void printA(int a,int b,char c){
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}


}


public class QueenEight{

	public static void main(String[] args){
		
		Queen Q=new Queen();
		Q.check(0);
		//System.out.println("num="+num);
	}


}

class Queen{
	int max=8;
	int[] arr = new int[max];	
	int num=0;


	public void check(int n){
		if(n==max){
			
			print();
			return;
		}
		for(int i=0;i<max;i++){
			arr[n]=i;
			if(judge(n)){
				check(n+1);
			}
		}

	}





	public boolean judge(int n){
		for(int i=0;i<n;i++){
			if(arr[i] == arr[n] || Math.abs(n-i) == Math.abs(arr[n]-arr[i])){
				return false;
			}
		}
		return true;
	}

	public void print(){
		num++;
		System.out.print("当前num=" + num + " 详细值为：");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
}


	
		
		
		

	


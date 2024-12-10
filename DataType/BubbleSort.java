//冒泡排序

public class BubbleSort{
	public static void main(String[] args){
		int[] arr = {-1,12,23,444,23,2,1,4,5,-29,67,-50};
		int temp;
		int l = arr.length;
		//排序次数
		for(int i=0;i<l-1;i++){
			//依次排序
			for(int j=0;j<l-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}

			//输出当前排序结果
			System.out.println("当前排序结果：");
			for(int k=0;k<l;k++){
				System.out.print(arr[k] + " ");
			}
			System.out.print("\n");
		}


	}
}
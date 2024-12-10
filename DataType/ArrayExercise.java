//数组练习
import java.util.Scanner;
public class ArrayExercise{
	public static void main(String[] args){
		//练习1
		// int arr1[] = {1,22,333};
		// int arr2[] = {44,55,66,77};
		// arr1 = arr2;
		// for(int i=0;i<arr1.length;i++){
		// 	System.out.print("arr1[" + i + "]= " +arr1[i] + '\t');
		// }

		//练习2
		Scanner myScanner = new Scanner(System.in);
		int arr3[] = {1,2,3,4,5};
		int arr4[];
		char sure;

		System.out.print("arr3数组当前内容为：");
		for(int i=0;i<arr3.length;i++){
						
			System.out.print(arr3[i] + " ");
			}
		System.out.println();
		System.out.println();

		while(true){
			System.out.println("是否将数组arr3进行缩减，y/n？");
			sure = myScanner.next().charAt(0);
			if(sure == 'y'){
				if(arr3.length>1){
					arr4 = new int[arr3.length-1];
					for(int i=0;i<arr3.length-1;i++){
					arr4[i]=arr3[i];
					}

					

					arr3 = arr4;
					//System.out.println("缩减后arr3数组长度为：" + arr3.length);
					System.out.print("缩减后arr3数组内容为：");
					for(int i=0;i<arr3.length;i++){
						
						System.out.print(arr3[i] + " ");
					}
					System.out.println();
					System.out.println("===================================");
					System.out.println();
				}
				else{
					System.out.println("arr3数组长度为：" + arr3.length);
					System.out.println("数组长度为1，结束缩减！");
					break;
				}
				
				
			}
			else if(sure == 'n'){
				System.out.println("结束缩减！");
				break;
			}
			else{
				System.out.println("输入错误，重新输入！");
			}
		
		}
		
	}
}
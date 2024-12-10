//二维数组练习
import java.util.Scanner;
public class TwoDimensionalArray05{
	public static void main(String[] args){

		Scanner myScanner = new Scanner(System.in);
		//练习1
		// int[] arr1 = {10,12,45,90};
		// int[] arr2 = new int[arr1.length+1];
		// int temp;
		// System.out.println("请输入要插入的值：");
		// //for(int i=0;i<)
		// //temp=myScanner.nextInteger();
		// arr2[arr1.length]=myScanner.nextInt();

		// for(int i=0;i<arr1.length;i++){
		// 	arr2[i] = arr1[i];

		// }

		// arr1 = arr2;

		// for(int i=0;i<arr1.length;i++){
		// 	for(int j=0;j<arr1.length-1-i;j++){
		// 		if(arr1[j]>arr1[j+1]){
		// 			temp =arr1[j];
		// 			arr1[j]=arr1[j+1];
		// 			arr1[j+1]=temp;
		// 		}
		// 	}

		// }

		// System.out.print("arr1={");
		// for(int i =0;i<arr1.length;i++){
		// 	System.out.print(arr1[i] + " ");
		// }
		// System.out.print("}");


		//练习2
		int[] arr = {10,12,45,90};
		int[] arrNew= new int[arr.length+1];
		int index =-1;
		System.out.println("请输入要插入的值：");
		int insertNum=myScanner.nextInt();

		for(int i = 0;i<arr.length;i++){
			if(insertNum<arr[i]){
				index = i;
				break;
			}
		}

		for(int i = 0,j=0;i<arrNew.length;i++){
			if(index != i){
				arrNew[i] = arr[j];
				j++;
			}
			else{
				arrNew[i]=insertNum;
			}
		}

		arr =arrNew;
		System.out.print("arr={");
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.print("}");


	}
}
//������ϰ
import java.util.Scanner;
public class ArrayExercise{
	public static void main(String[] args){
		//��ϰ1
		// int arr1[] = {1,22,333};
		// int arr2[] = {44,55,66,77};
		// arr1 = arr2;
		// for(int i=0;i<arr1.length;i++){
		// 	System.out.print("arr1[" + i + "]= " +arr1[i] + '\t');
		// }

		//��ϰ2
		Scanner myScanner = new Scanner(System.in);
		int arr3[] = {1,2,3,4,5};
		int arr4[];
		char sure;

		System.out.print("arr3���鵱ǰ����Ϊ��");
		for(int i=0;i<arr3.length;i++){
						
			System.out.print(arr3[i] + " ");
			}
		System.out.println();
		System.out.println();

		while(true){
			System.out.println("�Ƿ�����arr3����������y/n��");
			sure = myScanner.next().charAt(0);
			if(sure == 'y'){
				if(arr3.length>1){
					arr4 = new int[arr3.length-1];
					for(int i=0;i<arr3.length-1;i++){
					arr4[i]=arr3[i];
					}

					

					arr3 = arr4;
					//System.out.println("������arr3���鳤��Ϊ��" + arr3.length);
					System.out.print("������arr3��������Ϊ��");
					for(int i=0;i<arr3.length;i++){
						
						System.out.print(arr3[i] + " ");
					}
					System.out.println();
					System.out.println("===================================");
					System.out.println();
				}
				else{
					System.out.println("arr3���鳤��Ϊ��" + arr3.length);
					System.out.println("���鳤��Ϊ1������������");
					break;
				}
				
				
			}
			else if(sure == 'n'){
				System.out.println("����������");
				break;
			}
			else{
				System.out.println("��������������룡");
			}
		
		}
		
	}
}
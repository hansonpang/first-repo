
import java.util.Scanner;
public class MulForExercise{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);

		int totalLevel;
		System.out.println("���������������");
		totalLevel = myScanner.nextInt();
		System.out.println("========================");

		//ʹ��forʵ��
		//i����ǰ����
		// for(int i =1; i<=totalLevel;i++){ 

		// 	//x����ǰ��� �ո� ��
		// 	for(int x =1;x<=totalLevel-i;x++){
		// 		System.out.print(" ");
		// 	}

		// 	if(i < totalLevel){
		// 		//j����ǰ��� * ��
		// 		for(int j = 1;j<=i*2-1;j++){    
		// 		    //System.out.print(j+ "   ");
		// 			if((j == 1)||(j == i*2-1)){
		// 				System.out.print("*");
		// 			}
		// 			else{
		// 				System.out.print(" ");
		// 			}
		// 		}
		// 		System.out.println();
		// 	}
		// 	else{
		// 		//j����ǰ��� * ��
		// 		for(int j = 1;j<=i*2-1;j++){    
				    
		// 				System.out.print("*");
		// 			}
		// 	}
		// }

		//ʹ��whileʵ��	
		int i =1,j=1,x=1;
		while(i <=totalLevel){

			x=1;
			while(x<=totalLevel-i){
				System.out.print(" ");
				x++;
			}

			if(i < totalLevel){
				//j����ǰ��� * ��
				j=1;
				while(j<=i*2-1){    
				    //System.out.print(j+ "   ");
					if((j == 1)||(j == i*2-1)){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
					j++;
				}
				System.out.println();
			}
			else{
				//j����ǰ��� * ��
				j=1;
				while(j<=i*2-1){    
				    
						System.out.print("*");
						j++;
					}
			}

			i++;

		}

	}
}
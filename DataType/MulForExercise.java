
import java.util.Scanner;
public class MulForExercise{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);

		int totalLevel;
		System.out.println("请输入金字塔层数");
		totalLevel = myScanner.nextInt();
		System.out.println("========================");

		//使用for实现
		//i代表当前层数
		// for(int i =1; i<=totalLevel;i++){ 

		// 	//x代表当前层的 空格 数
		// 	for(int x =1;x<=totalLevel-i;x++){
		// 		System.out.print(" ");
		// 	}

		// 	if(i < totalLevel){
		// 		//j代表当前层的 * 数
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
		// 		//j代表当前层的 * 数
		// 		for(int j = 1;j<=i*2-1;j++){    
				    
		// 				System.out.print("*");
		// 			}
		// 	}
		// }

		//使用while实现	
		int i =1,j=1,x=1;
		while(i <=totalLevel){

			x=1;
			while(x<=totalLevel-i){
				System.out.print(" ");
				x++;
			}

			if(i < totalLevel){
				//j代表当前层的 * 数
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
				//j代表当前层的 * 数
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
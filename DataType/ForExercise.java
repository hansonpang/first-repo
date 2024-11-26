//测试for循环

public class ForExercise{
	public static void main(String[] args){
		//测试1   打印1-100之间所有是9的倍数的整数，统计个数及总和
		// int i,num,sum;
		// i =1;
		// num = 0;
		// sum = 0;
		// for(;i<=100;i++){
		// 	if(i%9==0){
		// 		System.out.println("i = " + i);
		// 		num++;
		// 		sum = sum + i;
		// 	}
		// }

		// System.out.println("================================");
		// System.out.println("个数为：" + num + '\n' + "总和为： " + sum);


		//测试2
		// int sum;
		// for(int i = 0,j=5;i<=5;i++,j--){
		// 	sum =i + j;
		// 	System.out.println(i + " + " + j +" = " + sum);
		// }

		//测试3
		// int i = 1;
		// while(i <= 100){
		// 	if(i % 3 == 0){
		// 		System.out.println(i);

		// 	}
		// 	i++;
		// }

		//测试4
		int i = 40;
		while(i <= 200){
			if(i % 2 == 0){
				System.out.println(i);

			}
			i++;
		}

	}
}
//do  while 练习
public class DoWhileExercise{
	public static void main(String[] args){

		//练习1
		// int i = 1;
		// do{
		// 	System.out.println("i =" + i);
		// 	i++;
		// }while(i<=100);


		//练习2
		// int i = 1,sum =0;
		// do{
		// 	sum = sum + i;
		// 	i++;
		// }while(i<=100);

		// System.out.println("1-100的和为："+ sum);


		//练习3
		int i = 1,count = 0;
		do{
			if((i%5==0)&&(i%3!=0)){
				System.out.println("i = " + i);
				count++;
			}

			i++;
		}while(i<=200);
		System.out.println("1-200之间能被5整除但不能被3整除的数的个数为：" + count);



	}
}
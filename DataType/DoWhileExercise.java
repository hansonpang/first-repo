//do  while ��ϰ
public class DoWhileExercise{
	public static void main(String[] args){

		//��ϰ1
		// int i = 1;
		// do{
		// 	System.out.println("i =" + i);
		// 	i++;
		// }while(i<=100);


		//��ϰ2
		// int i = 1,sum =0;
		// do{
		// 	sum = sum + i;
		// 	i++;
		// }while(i<=100);

		// System.out.println("1-100�ĺ�Ϊ��"+ sum);


		//��ϰ3
		int i = 1,count = 0;
		do{
			if((i%5==0)&&(i%3!=0)){
				System.out.println("i = " + i);
				count++;
			}

			i++;
		}while(i<=200);
		System.out.println("1-200֮���ܱ�5���������ܱ�3���������ĸ���Ϊ��" + count);



	}
}
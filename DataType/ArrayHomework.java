

public class ArrayHomework{
	public static void main(String[] args){
		
		int[] arr = new int[10];
		int num;
		boolean have;
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100)+1;
			
			
		}


		System.out.print("�����ӡ��arr = {");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.print("}");

		System.out.print("\n�����ӡ��arr = {");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i] + " ");
		}
		System.out.print("}\n");


		int sum=arr[0];
		int max=arr[0];
		int index=0;
		for(int i =1;i<arr.length;i++){
			sum+=arr[i];
			if(max<arr[i]){
				max=arr[i];
				index=i;
			}
		}
		int avg = sum/arr.length;
		System.out.println("ƽ��ֵ="+avg+"  ���ֵ="+max+"  ���ֵ���±�="+index);

	}
}
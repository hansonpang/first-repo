
public class A01{
	public static void main(String[] args){
		double[] d1 = {1.1,2.2,1.3,1.4};
		GetMax m = new GetMax();
		System.out.println("����d1�����ֵ�� " + m.max(d1) );

	}
}

class GetMax{
	public double max(double[] d){
		double maxNumber=d[0];
		for(int i = 1;i<d.length;i++){
			if(maxNumber<d[i]){
				maxNumber=d[i];
			}
		}
		return maxNumber;
	}
}
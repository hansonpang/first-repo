//
public class OverLoadExercise{
	public static void main(String[] args){
		Methods m = new Methods();
		int a = m.calculate(2);
		System.out.println("ƽ���������ǣ� " + a);

		int b = m.calculate(2,3);
		System.out.println("����������ǣ� " + b);

		System.out.println(m.calculate("���ԣ�"));

		System.out.println(m.max(1,2));

		System.out.println(m.max(1.1,2.1));

		System.out.println(m.max(1.1,2.2,10));

		System.out.println(m.showScore("����",1.1,2.2,10,100));
	}
}

class Methods{
	public int calculate(int a){
		return a * a;
	}

	public int calculate(int a,int b){
		return a*b;
	}

	public String calculate(String s){
		return s;
	}


	public int max(int a,int b){
		return a>b?a:b;
	}

	public double max(double a,double b){
		return a>b?a:b;
	}

	public double max(double a,double b,double c){
		System.out.println("max(double a,double b,double c)");
		double x=a>b?a:b;
		return x>c?x:c;
	}

	public double max(double a,double b,int c){
		System.out.println("max(double a,double b,int c)");
		double x=a>b?a:b;
		return x>c?x:c;
	}

	public String showScore(String name,double... score){
		double totalScore = 0;
		for(int i=0;i<score.length;i++){
			totalScore += score[i];
		}
		return "������"+name+"��"+ score.length +"���ܷ֣�"+ totalScore;

	}

}
//
public class RecursionExercise02{
	public static void main(String[] args){
		Peach p = new Peach();
		int peachQua = p.peachQuantity(3,2);
		System.out.println("一共有 " + peachQua + "颗桃子");
	}
}

//共有x个桃子
// 1-9天，每天吃一半，并多吃一个
//第十天还没开始吃 就只剩一个
class Peach{
	public int peachQuantity(int day,int a){
		if(day>1){
			
			return (peachQuantity(day-1,a)+1)*2;
		}
		else if(day == 1){
			return a;
		}
		else{
			return -1;
		}
	}
}
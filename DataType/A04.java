public class A04{
	public static void main(String[] args){
		double r =2;
		Circle c = new Circle(r);
		System.out.println("µ±Ô²°ë¾¶Îª" + r + "Ê±£¬Ô²ÖÜ³¤=" + c.perimeter + " Ô²Ãæ»ý=" + c.area)
	}
}

class Circle{
	double pai = 3.14;
	double d;
	public Circle(double d){
		this.d=d;
	}
	public double perimeter(){
		return 2*pai*d;
	}
	public double area(){
		return pai*d*d;
	}
}
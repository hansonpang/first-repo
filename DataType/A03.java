public class A03{
	public static void main(String[] args){
		double price  = 150.1;
		Book b = new Book(price);
		System.out.println("�޸�ǰ�۸�Ϊ��" + price + "�޸ĺ�۸�Ϊ�� " + b.updatePrice());

		int[] a1 = {1,2,3,45,6};
		Arr arr = new Arr();
		int[] a2 = arr.copyArr(a1);
		System.out.println("���ƺ������Ϊ��");
		for(int i=0;i<a2.length;i++){
			System.out.print(a2[i]+" ");
		}
	}
}

class Book{
	double price;
	public Book(double price){
		this.price= price;
	}

	public double updatePrice(){
		if(price>150){
			return 150;
		}
		else if(100<price&&price<=150){
			return 100;
		}
		return price;
	}
}

class Arr{
	public int[] copyArr(int[] a){
		int n =a.length;
		int[] a1 = new int[n];
		for(int i = 0;i<a.length;i++){
			a1[i] = a[i];
		}
		return a1;
	}
}
public class TestPerson{
	public static void main(String[] args){
		Person p1 = new Person("张三",18);
		Person p2 = new Person("张三",18);
		System.out.println("对比结果为：" + p1.compareTo(p2));
	}
}

class Person{
	String name;
	int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean compareTo(Person p){
		// if(this.name.equals(p.name) && this.age == p.age){
		// 	return true;
		// }
		// return false;
		return (this.name.equals(p.name) && this.age == p.age);
	}
}


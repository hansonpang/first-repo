
public class A02{
	public static void main(String[] args){
		String[] s = {"��","��","��","��","��"};
		String s1 = "��";
		FindIndex f = new FindIndex();
		System.out.println("����Ϊ " + f.find(s,s1));
	}
}

class FindIndex{
	int index=-1;
	// int i =1;
	// String[] s = new String[i];
	// String s1;
	// public FindIndex(String[] s,String s1){
	// 	System.out.println("s���鳤��Ϊ "+s.length);
	// 	System.out.println("s��������Ϊ ");
	// 	for(int i=0;i<s.length;i++){
	// 		System.out.print(s[i] + " ");
	// 	}
	// 	System.out.println();

	// 	this.i = s.length;
	// 	System.out.println("i = " + i);
	// 	 for(int i=0;i<s.length;i++){
	// 	 	this.s[i] = s[i];
	// 	 }
	// 	this.s1 = s1;
	// }

	public int find(String[] s,String s1){
		
		for(int i=0;i<s.length;i++){
			if(s1.equals(s[i])){
				index = i;
				return index;
			}
		}
		return index;
	}
}
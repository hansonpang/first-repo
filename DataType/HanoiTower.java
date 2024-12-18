//汉诺塔游戏
public class HanoiTower{
	public static void main(String[] args){
		Tower tower=new Tower();
		tower.move(5,'A','B','C');
	}
}

class Tower{
	//方法解释：a塔有num层，通过b塔，移动到c塔
	public void move(int num,char a,char b,char c){
		//a塔只有1层，则可以直接移动到c塔。
		if(num<1){
			System.out.println("输入错误！请重新输入！");
		}
		else if(num == 1){
			System.out.println(a + "->" + c);
		}
		//a塔上有不止一层，则将a塔上除了最下面一层以外，其他层先通过c塔移动到b塔，然后再将a塔的最下面一层移动到c塔,
		else{
			move(num -1,a,c,b);
			System.out.println(a + "->" +c);
			move(num - 1,b,a,c);

		}
	}
}
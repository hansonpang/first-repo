//迷宫
public class MiGong{
	public static void main(String[] args){
		//定义迷宫二维数组，并赋值
		int[][] map=new int[8][7];
		for(int i=0;i<7;i++){
			map[0][i]=1;
			map[7][i]=1;
		}

		for(int i=0;i<8;i++){
			map[i][0]=1;
			map[i][6]=1;
		}

		map[3][1]=1;
		map[3][2]=1;

		//打印定义好的数组
		System.out.println("===========初始迷宫地图如下=============");
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}


		//进行找路并输出是否找路成功
		Find F = new Find();
		boolean find = F.findWay(map,1,1);
		System.out.println();
		System.out.println("===========找路结果如下=============");
		if(find){
			System.out.println("找到路了！");
		}
		else{
			System.out.println("没有找到路了！");
		}
		
		//打印找路后的数组
		System.out.println();
		System.out.println("===========找路后的迷宫地图如下=============");
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

	}
}
//findWay方法专门用来找出迷宫的路径
//如果找到，就返回true，否则返回false
//map 是个二维数组，用来表示迷宫
//i,j就是老鼠的位置，初始化的位置为（1，1）
//因为我们是递归的找路，所有先规定map数组的各个值的含义
// 0表示可以走  1表示障碍物   2表示可以走且走过了  3表示走过，但是走不通是死路
// 当map[6][5]=2 就说明找到同路，可以结束，否则就继续找。

class Find{
	public boolean findWay(int[][] map,int i, int j){
		if(map[6][5]==2){
			return true;
		}else{
			if(map[i][j]==0){
				map[i][j]=2;
				if(findWay(map,i+1,j)){ //向下走
					return true;
				}else if(findWay(map,i,j+1)){//向右走
					return true;
				}else if(findWay(map,i-1,j)){//向上走
					return true;
				}else if(findWay(map,i,j-1)){//向左走
					return true;
				}else{
					map[i][j]=3;
					return false;
				}
			}
			else{
				return false;
			}
		} 
			
	}
}
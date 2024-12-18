//�Թ�
public class MiGong{
	public static void main(String[] args){
		//�����Թ���ά���飬����ֵ
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

		//��ӡ����õ�����
		System.out.println("===========��ʼ�Թ���ͼ����=============");
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}


		//������·������Ƿ���·�ɹ�
		Find F = new Find();
		boolean find = F.findWay(map,1,1);
		System.out.println();
		System.out.println("===========��·�������=============");
		if(find){
			System.out.println("�ҵ�·�ˣ�");
		}
		else{
			System.out.println("û���ҵ�·�ˣ�");
		}
		
		//��ӡ��·�������
		System.out.println();
		System.out.println("===========��·����Թ���ͼ����=============");
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

	}
}
//findWay����ר�������ҳ��Թ���·��
//����ҵ����ͷ���true�����򷵻�false
//map �Ǹ���ά���飬������ʾ�Թ�
//i,j���������λ�ã���ʼ����λ��Ϊ��1��1��
//��Ϊ�����ǵݹ����·�������ȹ涨map����ĸ���ֵ�ĺ���
// 0��ʾ������  1��ʾ�ϰ���   2��ʾ���������߹���  3��ʾ�߹��������߲�ͨ����·
// ��map[6][5]=2 ��˵���ҵ�ͬ·�����Խ���������ͼ����ҡ�

class Find{
	public boolean findWay(int[][] map,int i, int j){
		if(map[6][5]==2){
			return true;
		}else{
			if(map[i][j]==0){
				map[i][j]=2;
				if(findWay(map,i+1,j)){ //������
					return true;
				}else if(findWay(map,i,j+1)){//������
					return true;
				}else if(findWay(map,i-1,j)){//������
					return true;
				}else if(findWay(map,i,j-1)){//������
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
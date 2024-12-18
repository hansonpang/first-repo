public class EightQueens {

    int queenNum = 8;
    int[] arr = new int[queenNum];
    static int count = 0;

    public static void main(String[] args) {
        EightQueens eightQueens = new EightQueens();
        eightQueens.check(0);
        System.out.println("����"+count+"�ֽⷨ");

    }

    // ���õ�n+1���ʺ�
    // ��Ҫע��ÿһ��check�ݹ�ʱ������ִ��forѭ������˻��������
    private void check(int n) {
        if (n == queenNum) { // �ݹ���ֹ��������ʾǰ8���ʺ󶼷�����ɣ����˳�����
            print();
            return;
        }
        for (int i = 0; i < queenNum; i++) { // �˴�i < 8��ʾ������ÿһ�еĲ�ͬ��
            // ѭ����ʼʱ�Ƚ���n+1���ʺ�����ڵ�һ�е�λ��
            arr[n] = i;
            // �жϵ�n+1���ʺ������i��ʱ��ǰ�����лʺ��Ƿ��ͻ
            if (judge(n)) {
                // ������ͻ��ʼ������һ���ʺ󣬼���ʼ�ݹ�
                check(n + 1);
            }
            // ����ͻ�������ִ��arr[n] = i++�����ûʺ������һ��
        }
    }

    // �жϵ�ǰ���õĵ�n+1���ʺ��Ƿ���ǰ��Ļʺ�λ�ó�ͻ
    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[n] || Math.abs(n - i) == Math.abs(arr[n] - arr[i])) {
                return false;
            }
        }
        return true;
    }

    // ���arr���飬���ʺ�ڷ�λ�õ�ÿһ�ֽⷨ
    private void print() {
        count++;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
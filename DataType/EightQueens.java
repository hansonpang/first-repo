public class EightQueens {

    int queenNum = 8;
    int[] arr = new int[queenNum];
    static int count = 0;

    public static void main(String[] args) {
        EightQueens eightQueens = new EightQueens();
        eightQueens.check(0);
        System.out.println("共有"+count+"种解法");

    }

    // 放置第n+1个皇后
    // 需要注意每一次check递归时，都会执行for循环，因此会产生回溯
    private void check(int n) {
        if (n == queenNum) { // 递归终止条件，表示前8个皇后都放置完成，即退出程序
            print();
            return;
        }
        for (int i = 0; i < queenNum; i++) { // 此处i < 8表示放置在每一行的不同列
            // 循环开始时先将第n+1个皇后放置在第一列的位置
            arr[n] = i;
            // 判断第n+1个皇后放置在i列时与前面所有皇后是否冲突
            if (judge(n)) {
                // 若不冲突开始放置下一个皇后，即开始递归
                check(n + 1);
            }
            // 若冲突，则继续执行arr[n] = i++，将该皇后往后摆一列
        }
    }

    // 判断当前放置的第n+1个皇后是否与前面的皇后位置冲突
    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[n] || Math.abs(n - i) == Math.abs(arr[n] - arr[i])) {
                return false;
            }
        }
        return true;
    }

    // 输出arr数组，即皇后摆放位置的每一种解法
    private void print() {
        count++;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
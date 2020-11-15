package leetcode.其他;

/**
 * @ClassName _01_07_旋转矩阵
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/8 10:04
 */
public class _01_07_旋转矩阵 {
    //顺时针旋转90度等于延对角线反转+平面反转；
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 先以对角线（左上-右下）为轴进行翻转
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        //再对每一行以中点进行反转
        //直接可以取中间
        int mid = n >> 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mid; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
    }



    public static void rotate1(int[][] matrix) {
        int n = matrix.length;
        /*for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }*/

        //0 0,与 0 2    0 0 与 2 0
        //1 0 与 1 2
        //2 0 与 2 2  ---------->>>顺时针旋转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }

        //0 0 与 2 0
        //0 1 与 2 1
        //0 2 与 2 2     ---------->>>逆时针旋转
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }

        //后面两个for循环是顺时针循环180°


    }

    //17点00分 2020/5/22
    public void rotate4(int[][] matrix) {
        int n = matrix.length;
        //矩阵转置，即按斜对角线进行数据交换
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //矩阵根据中间列进行对折，得到最终结果
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate1(a);
        System.out.print("\t");
        for (int i = 0; i <= a.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\n\t" + "-------------------------");
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(i + "  |\t");

            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t"); // "\t"是制表符
            }
            System.out.println();
        }
    }


}
package Leetcode.数组;

/**
 * @ClassName _01_二维元素的查找
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/2 16:34
 */
public class _01_二维元素的查找 {
    public boolean search(int[][] arr, int target) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) return false;

        int cow = arr.length;//横着
        int row = arr[0].length;//竖着
        int c = 0;
        int r = row - 1;
        while (c <= cow-1 && r >= 0) {
            if (arr[c][r] > target) {
                r--;
            }else if (arr[c][r]<target){
                c++;
            }else {
                return true;
            }
        }
        return false;
    }
}
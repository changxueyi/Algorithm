package 剑指offer.数组;

/**
 * @ClassName _11_旋转数组的最小数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/6 10:51
 */
public class _11_旋转数组的最小数字 {
    //暴力解法--暴力美学
    public int minArray(int[] numbers) {
        int j = 1;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[j]<numbers[i]){
                return numbers[j];
            }else {
                j++;
            }
        }
        return numbers[0];
    }
}
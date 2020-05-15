package 剑指offer.数组;

import java.util.HashMap;

/**
 * @ClassName _56_I_数组中数字出现的次数
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/7 9:07
 */
public class _56_I_数组中数字出现的次数 {
    //要求时间复杂度是O(n)，空间复杂度是O(1)。
    //*******************不符合要求的解法使用HashMap统计***************************
    public int[] singleNumbers(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        int[] arr = new int[2];
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                arr[a] = nums[i];
                a++;
            }
        }
        return arr;
    }


    public int[] singleNumbers1(int[] nums) {
        int sum = 0;
        //将数组所有元素进行异或，最后的结果一定是那两个单一数字的异或结果。看上图示例
        //用示例[4,4,6,1]最后的抑或结果就是 6和1异或的结果 7
        for (int i = 0; i < nums.length; i++) {
            sum^=nums[i];
        }
        int first = 1;
        //通过与运算找到result第一个不为0的首位，7=>0111，也就是第一位
        while((sum&first)==0){
            first=first<<1;
        }
        //first为1，所以我们可以根据数组元素的二进制低位第一位是否为1，将数组分为2类，
        // 示例数组可以分为     低位第一位为0：[4,4,6]     低位第一位为1：[1]
        //此时再将两个数组两两异或就可以得到最终结果。
        //之后的操作只需将这两个数分出来即可
       // 以nums = [4, 1, 4, 6]为例：
       // nums异或一遍后为0x0111，要想将不同的两数分离，只需在异或时选择一位与1的对应位相同，并且与6的对应位不同即可，
        //那异或结果都是0x0111，说明这两个不同的数值的不同位为0x0100,0x0010,0x0001，所以选择最低位异或即可将其分出。
        //例：div选择0x0001: 0x0001与nums = [4, 1, 4, 6]所有数值异或，会得到两组数组，最后一位=1的数为1，最后一位=0的数为4,4,6。
        //两组数分别异或得最终不同的两数：1，4^4^6=6，即1和6找到。
        int result[]=new int[2];
        for(int i=0;i<nums.length;i++){
            //将数组分类。
            if((nums[i]&first)==0){
                result[0]^=nums[i];
            }
            else{
                result[1]^=nums[i];
            }
        }
        return result;
    }
}
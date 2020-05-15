package 剑指offer.其他;

import java.util.Arrays;

/**
 * @ClassName _61_扑克牌中的顺子
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/7 15:03
 */
public class _61_扑克牌中的顺子 {
    public boolean isStraight(int[] nums) {
        int joker = 0;
        Arrays.sort(nums); // 数组排序
        for(int i = 0; i < 4; i++) {
            if(nums[i] == 0) joker++; // 统计大小王数量
            else if(nums[i] == nums[i + 1]) return false; // 若有重复，提前返回 false
        }
        return nums[4] - nums[joker] < 5; // 最大牌 - 最小牌 < 5 则可构成顺子
        //获取最大 / 最小的牌： 排序后，数组末位元素 nums[4]nums[4] 为最大牌；
        // 元素 nums[joker]nums[joker] 为最小牌，其中 jokerjoker 为大小王的数量。
    }
}
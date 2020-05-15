package leetcode.搜索旋转排序数组;

/**
 * @ClassName _153_寻找旋转排序数组中的最小值
 * @Description TODO https://leetcode-cn.com/problems/search-in-rotated-sorted-array/solution/yi-wen-jie-jue-4-dao-sou-suo-xuan-zhuan-pai-xu-s-2/
 * @Author changxueyi
 * @Date 2020/5/10 8:54
 */
public class _153_寻找旋转排序数组中的最小值 {
    /**
     * 若 nums[left] <= nums[MidOrder]，说明区间 [left,MidOrder] 连续递增，则最小元素一定不在这个区间里，
     * 可以直接排除。因此，令 left = MidOrder+1，在 [MidOrder+1,right] 继续查找
     * 否则，说明区间 [left,MidOrder] 不连续，则最小元素一定在这个区间里。因此，令 right = MidOrder，在 [left,MidOrder] 继续查找
     * [left,right] 表示当前搜索的区间。注意 right 更新时会被设为 MidOrder 而不是 MidOrder-1，因为 MidOrder 无法被排除。
     * 这一点和「33 题 查找特定元素」是不同的
     *
     * @return
     */
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {// 实际上是不会跳出循环，当 left==right 时直接返回
            //和上面的三道题不同的地方
            if (nums[left] <= nums[right]) {// 如果 [left,right] 递增，直接返回
                return nums[left];
            }
            int mid = left + (right - left) / 2;
            //下面一定要加上=号
            if (nums[left] <= nums[mid]) { // [left,MidOrder] 连续递增，则在 [MidOrder+1,right] 查找
                left = mid + 1;
            } else {
                //说明最小值在左边
                right = mid;// [left,MidOrder] 不连续，在 [left,MidOrder] 查找,这个地方要特别的注意清楚
            }
        }
        return -1;
    }

    public int findMin2(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;// +1是因为mid一定不会是最小值
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
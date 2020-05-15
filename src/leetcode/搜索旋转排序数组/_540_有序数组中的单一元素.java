package leetcode.搜索旋转排序数组;

/**
 * @ClassName _540_有序数组中的单一元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/13 9:56
 */
public class _540_有序数组中的单一元素 {
    //位运算
    public int singleNonDuplicate1(int[] nums) {
        //   if (nums==null||nums.length==0) return -1;
        int a = 0;
        for (int i = 1; i < nums.length; i++) {
            nums[a] = nums[a] ^ nums[i];
        }
        return nums[a];
    }

    public int singleNonDuplicate(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            boolean halvesAreEven = (hi - mid) % 2 == 0;//奇数为true 偶数为false
            if (nums[mid + 1] == nums[mid]) {
                if (halvesAreEven) {//右边是奇数
                    lo = mid + 2;
                } else {
                    //右边是奇数
                    hi = mid - 1;
                }
            } else if (nums[mid - 1] == nums[mid]) {
                if (halvesAreEven) {//右边是偶数
                    hi = mid - 2;
                } else {
                    lo = mid + 1;
                }
            } else {
                return nums[mid];
            }
        }
        return nums[lo];
    }


    public int singleNonDuplicate2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (right > left) {
            int mid = left + (right - left) / 2;
            boolean b = (right - mid) % 2 == 0;
            //如果是true ，说明右边是偶数，false 右边是奇数
            if (nums[mid] == nums[mid + 1]) {
                if (b) {
                    //说明在右边
                    left = mid + 2;
                } else {
                    right = mid - 1;
                }
            }
            else if (nums[mid] == nums[mid - 1]) {
                if (b) {
                    right = mid - 2;
                } else {
                    left = mid+1;
                }
            }
            else {
                return nums[mid];
            }
        }
        //已经碰到一块了，left = right
        return nums[left];
    }

}
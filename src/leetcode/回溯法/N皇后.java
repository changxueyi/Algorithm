package leetcode.回溯法;

/**
 * @ClassName N皇后
 * @Description TODO https://leetcode-cn.com/problems/permutations/solution/hui-su-suan-fa-xiang-jie-by-labuladong-2/
 *        ******************回溯看上面的就可以了**********************************
 * @Author changxueyi
 * @Date 2020/5/15 9:10
 */
public class N皇后 {
    /**
     * for 选择 in 选择列表:
     *     # 做选择
     *     将该选择从选择列表移除
     *     路径.add(选择)
     *     backtrack(路径, 选择列表)
     *     # 撤销选择
     *     路径.remove(选择)
     *     将该选择再加入选择列表
     */
}
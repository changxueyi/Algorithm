package leetcode.二叉树;

/**
 * @ClassName _100_相同的树_对比101题
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/18 15:13
 */
public class _100_相同的树_对比101题 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    //13点52分 2020/5/21
    public boolean isSameTree1(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
package 剑指offer.二叉树;

/**
 * @ClassName _55_I_二叉树的深度
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 9:03
 */
public class _55_I_二叉树的深度 {
    public int maxDepth(TreeNode root) {
        //如果为空的话，高度就是0
        if (root == null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
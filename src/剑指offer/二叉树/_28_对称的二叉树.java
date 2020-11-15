package 剑指offer.二叉树;

/**
 * @ClassName _28_对称的二叉树
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/21 13:37
 */
public class _28_对称的二叉树 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        else
            return recur(root.left, root.right);
    }

    boolean recur(TreeNode L, TreeNode R) {
        if (L == null && R == null) return true;
        if (L == null || R == null||L.val!=R.val) return false;
        return recur(L.left,R.right)&&recur(L.right,R.left);
    }
}
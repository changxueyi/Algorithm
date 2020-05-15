package leetcode.二叉树;

/**
 * @ClassName _101_对称二叉树__不会弄要多写
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/6 16:10
 */
public class _101_对称二叉树__不会弄要多写 {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right);
    }
}
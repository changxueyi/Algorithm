package leetcode.Test;



/**
 * @ClassName _226_反转二叉树
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/25 9:28
 */
public class _226_反转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        return root;
    }
}
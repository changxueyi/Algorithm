package leetcode.二叉树;

/**
 * @ClassName _236_二叉树的最近公共祖先
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/12 15:46
 */
public class _236_二叉树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left==null) return right;
        if (right==null) return left;
        return root;
    }
}
package leetcode.Top100;

/**
 * @ClassName _104_二叉树的最大深度
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/20 17:37
 */
public class _104_二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
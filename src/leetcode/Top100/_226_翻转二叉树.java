package leetcode.Top100;

/**
 * @ClassName _226_翻转二叉树
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/20 17:28
 */
public class _226_翻转二叉树 {
    public TreeNode fun(TreeNode root) {
        //递归的终止条件
        if (root == null) {
            return null;
        }
        //下面三句话是当前节点左右子树交换
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        //递归交换当前节点的左子树
        fun(root.left);
        //递归交换当前右子树
        fun(root.right);
        return root;
    }
}
package 剑指offer.二叉树;

/**
 * @ClassName _27_二叉树的镜像
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 9:33
 */
public class _27_二叉树的镜像 {
    public TreeNode mirrorTree(TreeNode root) {
        //递归函数的终止条件，节点为空时返回
        if (root == null) return root;

        //业务处理
        //递归交换当前节点的 左子树
        mirrorTree(root.left);
        //递归交换当前节点的 右子树
        mirrorTree(root.right);

        //下面三句是将当前节点的左右子树交换
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        //函数返回时就表示当前这个节点，以及它的左右子树
        //都已经交换完了
        return root;
    }
}
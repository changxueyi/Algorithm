package leetcode.二叉树;

import sun.reflect.generics.tree.Tree;

/**
 * @ClassName _226_翻转二叉树
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/6 14:54
 */
public class _226_翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        //递归函数的终止条件，节点为空时返回
        if (root == null)
            return null;
        //下面三句是将当前节点的左右子树交换
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //递归交换当前节点的 左子树
        root.left = invertTree(root.left);
        //递归交换当前节点的 右子树
        root.right = invertTree(root.right);

        //函数返回时就表示当前这个节点，以及它的左右子树
        //都已经交换完了
        return root;
    }

    //14点58分 2020/5/12 再战
    public TreeNode invertTree1(TreeNode root) {
        if (root == null)
            return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        return root;
    }

}
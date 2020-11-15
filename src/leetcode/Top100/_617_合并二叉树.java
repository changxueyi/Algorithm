package leetcode.Top100;

/**
 * @ClassName _617_合并二叉树
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/20 17:22
 */
public class _617_合并二叉树 {
    public TreeNode mergeTree(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTree(t1.left, t2.left);
        t2.right = mergeTree(t1.right, t2.right);
        return t1;
    }
}
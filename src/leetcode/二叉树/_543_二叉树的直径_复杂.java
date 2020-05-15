package leetcode.二叉树;


/**
 * @ClassName _543_二叉树的直径_复杂
 * @Description TODO https://leetcode-cn.com/problems/diameter-of-binary-tree/solution/java-shen-du-you-xian-bian-li-dfs-by-sugar-31/
 * @Author changxueyi
 * @Date 2020/5/6 16:49
 */
public class _543_二叉树的直径_复杂 {
    static int result;

    public int diameterOfBinaryTree(TreeNode root) {
        result = 0;
        depth(root);
        return result;
    }

    private int depth(TreeNode x) {
        if (x == null) return 0;
        // 分别遍历左右子树直至最底层，再回溯
        int leftDepth = depth(x.left);
        int rightDepth = depth(x.right);
        //result记录当前的最大直径
        result = Math.max(result, leftDepth + rightDepth);
        //result 取值为以经过 root，左右子树的最大深度之和 leftDepth + rigthDepth
        // （不用加 1，是因为根节点的深度是 1）
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
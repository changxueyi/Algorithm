package 剑指offer.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName _32_iii_从上到下打印二叉树
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 9:09
 */
public class _32_iii_从上到下打印二叉树 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return res;
        }
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()) {
            ArrayList<Integer> arr = new ArrayList<>();
            count++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if ((count & 1) == 1) {
                    //说明是奇数
                    arr.add(node.val);
                } else {
                    arr.add(0, node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(arr);
        }
        return res;
    }


    //09点33分 2020/5/11
    //层序遍历，Z形打印
    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> arr = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return arr;
        }
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()) {
            ArrayList<Integer> cur = new ArrayList<>();
            int size = queue.size();
            count++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if ((count & 1) == 1) {
                    //奇数，奇数直接打印
                    cur.add(node.val);
                } else {
                    //偶数反着打印
                    cur.add(0,node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            arr.add(cur);
        }
        return arr;
    }
}
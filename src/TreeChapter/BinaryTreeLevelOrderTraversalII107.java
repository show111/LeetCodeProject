package TreeChapter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * created by Hannah Li on 19/2/22
 * Project name: LeetcodeProject
 * LeetCode NO.: 107
 */
public class BinaryTreeLevelOrderTraversalII107 {


    /**
     * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
     *  (ie, from left to right, level by level from leaf to root).
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i< size; i++){
                TreeNode cur = queue.poll();
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
                list.add(cur.val);
            }
            res.add(0, list );
        }
        return res;
    }

    /**second method*/
    public List<List<Integer>> levelOrderBottom2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        helper(res, root,0);
        return res;
    }

    private void helper(List<List<Integer>> res, TreeNode root, int level) {
        if(res == null) return;
        if(level>= res.size()){
            res.add(0, new ArrayList<>());
        }
        res.get(res.size() - level -1).add(root.val);
        helper(res, root.left, level +1);
        helper(res, root.right, level +1);
    }


}

package TreeChapter;

/**
 * created by Hannah Li on 19/2/23
 * Project name: LeetcodeProject
 * LeetCode NO.: 108
 */
public class ConvertSortedArrayBinarySearchTree108 {


    /**
     * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
     * 0
     * / \
     * -3   9
     * /   /
     * -10  5
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = (right - left) / 2 + left;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, left, mid -1);
        node.right = helper(nums,mid +1,  right);
        return node;
    }


}
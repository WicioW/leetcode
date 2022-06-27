package trees;


/**
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 *
 *
 * Example 1:
 *
 *     [3]
 *   /   \
 * [9]  [20]
 *     /    \
 *  [15]     [7]
 *
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 *
 * Example 2:
 *
 * Input: root = [1,null,2]
 * Output: 2
 *
 *
 *
 * Constraints:
 *
 *     The number of nodes in the tree is in the range [0, 104].
 *     -100 <= Node.val <= 100
 */
public class MaximumDepthOfBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    //dfs
    public static int maxDepth(TreeNode root) {
        if(root ==null) return 0;
        return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
    }


    public static void main(String[] args) {
//        maxDepth(new int[]{3,9,20,null,null,15,7});
    }
}

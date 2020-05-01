public class BinaryTreeMaximumPathSum {
    // Leet 29
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int result;
    public int maxPathSum(TreeNode root){       // root = node
        result = Integer.MIN_VALUE;
        pathSum(root);
        return result;
    }

    private int pathSum(TreeNode node) {
        if (node == null)
            return 0;
        int left = Math.max(0, pathSum(node.left));
        int right = Math.max(0, pathSum(node.right));

        result = Math.max(result, left + right + node.val);

        return Math.max(left, right) + node.val;
    }
}

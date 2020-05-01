public class DiameterOfBinaryTree {
    // Leet 11
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ val = x;}
    }
    // Error some test cases
//    public int diameterOfBinaryTree(TreeNode root){
//        if (root == null)
//            return 0;
//        int left_depth = diameterOfBinaryTree(root.left);
//        int right_depth = diameterOfBinaryTree(root.right);
//
//        return Math.max(left_depth, right_depth) + 1;
//    }

    // Algo from Leetcode
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }
    public int depth(TreeNode node) {
        if (node == null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L+R+1);
        return Math.max(L, R) + 1;
    }
}

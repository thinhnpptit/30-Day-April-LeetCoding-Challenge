public class ValidSequenceFromRootToLeaves {
    // Leet 30
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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        if (root == null)
            return arr.length == 0;
        return isValid(root, arr, 0);
    }
    public boolean isValid(TreeNode node, int[] arr, int index){
        if (node.val != arr[index])         // not start from root
            return false;
        if (index == arr.length-1)
            return node.left == null && node.right == null;     // a valid sequence ?

        return node.left != null && isValid(node.left, arr, index+1) ||
                node.right != null && isValid(node.right, arr, index+1);
    }
}

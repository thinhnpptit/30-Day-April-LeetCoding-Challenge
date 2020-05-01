public class ConstructBinarySearchTreeFromPreorderTraversal {
    // Leet 20
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ val = x;}
    }
    public TreeNode bstFromPreorder(int[] preorder){
        if (preorder.length < 1)
            return null;
        return create(preorder, new int[]{0}, Integer.MAX_VALUE);
    }
    public static TreeNode create(int[] preorder, int[] cursor, int greaterParentNodeValue){
        TreeNode node = new TreeNode(cursor[0]);
        cursor[0]++;            // cursor is a array but has only 1 element
        if ( cursor[0] < preorder.length && preorder[cursor[0]] < node.val){    // left descendant value < parent node value
            node.left = create(preorder, cursor, node.val);
        }
        if (cursor[0] < preorder.length && preorder[cursor[0]] < greaterParentNodeValue){   // right descendant > parent node value
            node.right = create(preorder,cursor, greaterParentNodeValue);
        }
        return node;
    }
}

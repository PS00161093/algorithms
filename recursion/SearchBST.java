class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        // base case
        if(root == null || root.val == val) {
            return root;
        }

        if(val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}

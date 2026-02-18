package datastructures.treegraph.tree;

public class DiameterTree {
    static int diameter = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private static int height(TreeNode node) {
        if (node == null)
            return 0;

        int left = height(node.left);
        int right = height(node.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    public static boolean contains(TreeNode node, int value) {
        if (node == null) {
            return false;
        }

        if (value == node.value) {
            return true;
        } else if (value < node.value) {
            return contains(node.left, value); //checks left side
        } else {
            return contains(node.right, value); //checks right side
        }
    }

    public static void main(String[] args) {
        // Creating the BST from the example
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
        n2.left = n1;
        n2.right = n3;

        // Checking if the BST contains the value 3
        boolean result = contains(n2, 3);
        System.out.println(result);  // Output: true
    }
}

public class MCTree implements MCInterface {
    private MCNode root;

    public MCTree() {
        makeMCtree();
    }

    private void makeMCtree() {
        // Implementation to construct the Morse code tree
        // Initialize root, add letters as per Morse code specification
    }

    @Override
    public String encode(String s) {
        // Implementation to encode English letters to Morse code
        return null;
    }

    @Override
    public String decode(String s) {
        // Implementation to decode Morse code to English letters
        return null;
    }

    @Override
    public void inorderTraverse() {
        inorder(root);
    }

    private void inorder(MCNode node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.print(node.getLetter() + " ");
            inorder(node.getRight());
        }
    }

    @Override
    public void preorderTraverse() {
        preorder(root);
    }

    private void preorder(MCNode node) {
        if (node != null) {
            System.out.print(node.getLetter() + " ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    @Override
    public void postorderTraverse() {
        postorder(root);
    }

    private void postorder(MCNode node) {
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print(node.getLetter() + " ");
        }
    }

    // Additional helper methods...
}

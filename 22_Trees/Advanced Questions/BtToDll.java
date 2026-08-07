public class BtToDll {
    LLNode head;
    LLNode tail;

    public TreeNode convert(TreeNode root){
        if(root == null){
            return null;
        }
        helper(root);
        return root;
    }

    private void helper(TreeNode node){
        if(node == null){
            return;
        }
        helper(node.left);
        // Process the current node
        LLNode newNode = new LLNode(node.val);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        helper(node.right);
    }
}

class LLNode{
        int val;
        LLNode prev;
        LLNode next;

        LLNode(int val){
            this.val = val;
        }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
    }
}

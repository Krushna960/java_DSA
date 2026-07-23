import java.util.ArrayList;
import java.util.List;

public class SD {
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

    class Node {

        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public List<String> serialize(Node node){
        List<String> list = new ArrayList<>();
        helper(node, list);
        return list;
    }
    void helper(Node node, List<String> list){
        if(node == null){
            list.add("null");
            return;
        }
        list.add(String.valueOf(node.val));
        helper(node.left, list);
        helper(node.right, list);
    }

    Node deserialize(List<String> list){
        java.util.Collections.reverse(list);
        Node node = helper2(list);
        return node;
    }
    Node helper2(List<String> list){
        String val = list.remove(list.size() - 1);
        if(val.equals("null")){
            return null;
        }
        Node node = new Node(Integer.parseInt(val));
        node.left = helper2(list);
        node.right = helper2(list);
        return node;
    }
}

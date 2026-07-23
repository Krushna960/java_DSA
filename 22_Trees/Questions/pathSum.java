import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.tree.TreeNode;

public class pathSum {
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
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }

        if(root.val == targetSum && root.left == null && root.right == null){
            return true;
        }

        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    }

    public int sumNumbers(TreeNode root) {
        return sumNumbersHelper(root, 0);
    }
    private int sumNumbersHelper(TreeNode root, int sum){
        if(root == null){
            return 0;
        }
        sum = sum*10 + root.val;

        if(root.left == null && root.right == null){
            return sum;
        }

        return sumNumbersHelper(root.left, sum) + sumNumbersHelper(root.right, sum);
    }

    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode node) {
        maxPathSumHelper(node);
        return ans;
    }
    int maxPathSumHelper(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = maxPathSumHelper(node.left);
        int right = maxPathSumHelper(node.right);

        left = Math.max(left, 0);
        right = Math.max(right, 0);

        int pathSum = left + right + node.val;
        ans = Math.max(ans, pathSum);

        return Math.max(left, right) + node.val;
    }

    boolean findPath(Node node, int[] arr){
        if(node == null){
            return arr.length == 0;
        }
        return findPathHelper(node, arr, 0);
    }
    boolean findPathHelper(Node node, int[] arr, int index){
        if(node == null){
            return false;
        }
        if(index >= arr.length || node.val != arr[index]){
            return false;
        }
        if(node.left == null && node.right == null && index == arr.length - 1){
            return true;
        }
        return findPathHelper(node.left, arr, index+1) || findPathHelper(node.right, arr, index+1);
    }

    int countPaths(Node node, int sum){
        List<Integer> path = new ArrayList<>();
        return countPathsHelper(node, sum, path);
    }
    int countPathsHelper(Node node, int sum, List<Integer> path){
       if(node == null){
        return 0;
       } 
       path.add(node.val);
       int count = 0;
       int s = 0;
       //how many paths i can make
       ListIterator<Integer> itr = path.listIterator(path.size());
       while(itr.hasPrevious()){
            s += itr.previous();
            if(s == sum){
                count++;
            }
       }
       count += countPathsHelper(node.left, sum, path) + countPathsHelper(node.right, sum, path);

       //backtrack
       path.remove(path.size() - 1);
       return count;
    }

    //put in a list
    List<List<Integer>> findPaths(Node node, int sum){
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        countPathsHelper(node, sum, path);
        return paths;
    }
    void findPathsHelper(Node node, int sum, List<Integer> path, List<List<Integer>> paths){
       if(node == null){
        return;
       } 
       path.add(node.val);

       if(node.val == sum && node.left == null && node.right == null){
        paths.add(new ArrayList<>(path));
       }else{
        findPathsHelper(node.left, sum-node.val, path, paths);
        findPathsHelper(node.right, sum-node.val, path, paths);
       }

       //backtrack
       path.remove(path.size() - 1);
    }
}

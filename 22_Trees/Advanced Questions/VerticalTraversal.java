 import java.util.*;
class TreeNode {
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
class VerticalTraversal {
    public List<List<Integer>> verticalTraversal(TreeNode node) {
        List<List<Integer>> ans = new ArrayList<>();

        if(node == null) {
            return ans;
        }
        int col = 0;
        
        Queue<Map.Entry<TreeNode, Integer>> queue = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        queue.offer(new AbstractMap.SimpleEntry<>(node, col));

        int min = 0;
        int max = 0;

        while(!queue.isEmpty()){
            Map.Entry<TreeNode, Integer> removed = queue.poll();
            node = removed.getKey();
            col = removed.getValue();

            if(node != null){
                if(!map.containsKey(col)){
                    map.put(col, new ArrayList<Integer>());
                }

                map.get(col).add(node.val);

                min = Math.min(min, col);
                max = Math.max(max, col);

                queue.offer(new AbstractMap.SimpleEntry<>(node.left, col - 1));
                queue.offer(new AbstractMap.SimpleEntry<>(node.right, col + 1));
            }

            for(int i = min; i <= max; i++){
                if(map.containsKey(i)){
                    ans.add(map.get(i));
                }
            }
        }

        return ans;
    }
}

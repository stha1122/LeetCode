/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode infected;
    
    public int amountOfTime(TreeNode root, int start) {
        Map<TreeNode, TreeNode> hm = new HashMap<>();
        buildParent(root, null, hm, start);
        
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(infected);
        
        Set<Integer> seen = new HashSet<>();
        
        int minutes = 0;
        
        while (!q.isEmpty()) {
            int size = q.size();
            minutes++;
            
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                // System.out.println(curr.val);
                
                seen.add(curr.val);
                
                if (curr.left != null && !seen.contains(curr.left.val)) 
                    q.offer(curr.left);
                
                if (curr.right != null && !seen.contains(curr.right.val))
                    q.offer(curr.right);
                
                if (hm.containsKey(curr) && hm.get(curr) != null && !seen.contains(hm.get(curr).val))
                    q.offer(hm.get(curr));
            }
        }
        
        return minutes - 1;
    }
    
    public void buildParent(TreeNode node, TreeNode parent, Map<TreeNode, TreeNode> hm, int start) {
        if (node == null)
            return;
    
        if (start == node.val) 
            infected = node;
        
        hm.put(node, parent);
        
        if (node.left != null)
            buildParent(node.left, node, hm, start);
        
        if (node.right != null)
            buildParent(node.right, node, hm, start);
    }
}
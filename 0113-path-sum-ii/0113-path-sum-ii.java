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
    List<List<Integer>> list = new ArrayList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        boolean check = hasPathSum(root,targetSum,"0");
        
        return list;
    };
    
    public boolean hasPathSum(TreeNode root, int targetSum,String hist) {
        if(root == null) return false;
        
        String temp_hist = hist + "," + Integer.toString(root.val);
        
        int currentSum = targetSum - root.val;
        if(currentSum == 0 && root.left == null && root.right == null){
            String[ ] nums = temp_hist.split(",");
            List<Integer> item = new ArrayList<>();

            for (int i = 1; i < nums.length; i++) {
                int num = Integer.parseInt(nums[i]);
                item.add(num);
            }
            list.add(item);
        
            return false;   
        }
        
        return hasPathSum(root.left, currentSum,temp_hist) || hasPathSum(root.right, currentSum,temp_hist);
    }
}
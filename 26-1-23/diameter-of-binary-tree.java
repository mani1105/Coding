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
    int diameter =0;
    public int height(TreeNode t){
        if(t==null){
            return 0;
        }
        int leftc=height(t.left);
        int rightc = height(t.right);
        
        diameter = Math.max(diameter,leftc+rightc);
       
        return Math.max(leftc,rightc)+1;
            
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
        
    }
}

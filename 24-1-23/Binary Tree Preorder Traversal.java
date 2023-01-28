class Solution {
    void preorderTraversal(TreeNode root,List list){
        if(root==null){
            return ;
        }
        list.add(root.val);
        preorderTraversal(root.left,list);
        preorderTraversal(root.right,list);
        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list =new ArrayList <Integer>();
        preorderTraversal(root,list);
        return list;

        
    }
}

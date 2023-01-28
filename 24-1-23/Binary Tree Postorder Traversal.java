class Solution {
    void postorderTraversal(TreeNode root ,List list){
        if(root==null){
            return ;
        }
        postorderTraversal(root.left,list);
        postorderTraversal(root.right,list);
        list.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list= new ArrayList <Integer>();
        postorderTraversal(root,list);
        return list;
        
    }
}

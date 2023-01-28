class Solution {
    void inorderTraversal(TreeNode root,List list){
        if(root==null){
            return;
        }
        inorderTraversal(root.left,list);
        list.add(root.val);
        inorderTraversal(root.right,list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        inorderTraversal(root,list);
        return list;       
    }
}

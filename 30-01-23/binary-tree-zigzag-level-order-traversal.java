class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        goDFS(0, root, lists);
        for (int i = 1; i < lists.size(); i+=2) Collections.reverse(lists.get(i));
        return lists;
    }

    private void goDFS(int h, TreeNode node, List<List<Integer>> lists) {
        if (node == null) return;

        if (lists.size() < h + 1) {
            List<Integer> list = new ArrayList<>();
            list.add(node.val);
            lists.add(list);
        } else {
            lists.get(h).add(node.val);
        }
        h=h+1;
        goDFS(h, node.left, lists);
        goDFS(h, node.right, lists);
    }
}

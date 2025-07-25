public class same_tree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        Queue<TreeNode> queue1 = new LinkedList<>();
//        Queue<TreeNode> queue2 = new LinkedList<>();
//
//        queue1.offer(p);
//        queue2.offer(q);
//
//        while (!queue1.isEmpty() && !queue2.isEmpty()) {
//            TreeNode node1 = queue1.poll();
//            TreeNode node2 = queue2.poll();
//
//            if (node1 == null && node2 == null) continue;
//            if (node1 == null || node2 == null) return false;
//            if (node1.val != node2.val) return false;
//
//            queue1.offer(node1.left);
//            queue1.offer(node1.right);
//            queue2.offer(node2.left);
//            queue2.offer(node2.right);
//        }
//
//        return queue1.isEmpty() && queue2.isEmpty();
//    }
}

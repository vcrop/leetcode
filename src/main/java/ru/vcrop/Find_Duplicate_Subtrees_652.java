package ru.vcrop;

import java.util.*;

//  !!!!!!!!! Not solved !!!!!!!
public class Find_Duplicate_Subtrees_652 {

    private int hash(TreeNode root, Map<Integer,TreeNode> visited, Set<Integer> subTrees, List<TreeNode> result) {
        if (root == null) return 0;
        int hashValue = visited.computeIfAbsent(root.val, TreeNode::new).hashCode();
        int ret = Objects.hash(hashValue, hash(root.left, visited, subTrees, result),
                hash(root.right, visited, subTrees, result));
        if (subTrees.contains(ret)) result.add(root);
        return ret;
    }

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ret = new ArrayList<>();
        hash(root, new HashMap<>(), new HashSet<>(), ret);
        return ret;
    }
}

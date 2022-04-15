package ru.vcrop;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Runtime: 6 ms, faster than 5.51% of Java online submissions for Print Binary Tree.
        Memory Usage: 42.9 MB, less than 80.23% of Java online submissions for Print Binary Tree.*/
public class Print_Binary_Tree_655 {

    public static class TreeNode {
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

    private int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

    private void solution(TreeNode root, int left, int right, List<List<String>> ret, int depth) {
        if (root != null) {
            int pos = (left + right) / 2;
            ret.get(depth).set(pos, Integer.toString(root.val));
            solution(root.left, left, pos - 1, ret, depth + 1);
            solution(root.right, pos + 1, right, ret, depth + 1);
        }
    }

    public List<List<String>> printTree(TreeNode root) {
        int depth = depth(root);
        List<List<String>> ret = IntStream.range(0, depth)
                .mapToObj(d -> Stream.generate(() -> "")
                        .limit((1L << depth) - 1)
                        .collect(Collectors.toList()))
                .toList();
        solution(root, 0, (1 << depth) - 1, ret, 0);
        return ret;
    }
}

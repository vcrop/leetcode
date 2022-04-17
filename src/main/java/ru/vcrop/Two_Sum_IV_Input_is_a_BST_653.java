package ru.vcrop;

import java.util.HashSet;
import java.util.Set;

/*Runtime: 5 ms, faster than 72.49% of Java online submissions for Two Sum IV - Input is a BST.
        Memory Usage: 52.4 MB, less than 17.48% of Java online submissions for Two Sum IV - Input is a BST.*/
public class Two_Sum_IV_Input_is_a_BST_653 {

    private boolean sol(TreeNode root, Set<Integer> s, int k) {
        if (root == null) return false;
        if (s.contains(k - root.val)) return true;
        s.add(root.val);
        return sol(root.left, s, k) || sol(root.right, s, k);
    }


    public boolean findTarget(TreeNode root, int k) {
        return sol(root, new HashSet<>(), k);
    }

}

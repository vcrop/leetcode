package ru.vcrop;

/*https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/
        Runtime: 5 ms, faster than 36.72% of Java online submissions for Verify Preorder Serialization of a Binary Tree.
        Memory Usage: 39.4 MB, less than 30.20% of Java online submissions for Verify Preorder Serialization of a Binary Tree.*/
public class Verify_Preorder_Serialization_of_a_Binary_Tree_331 {

    private String implementation(String preorder) {
        if (preorder == null || preorder.isEmpty()) return null;
        String[] root = preorder.split(",", 2);
        if (root[0].equals("#")) return root.length == 1 ? "" : root[1];
        if (root.length == 1) return null;
        return implementation(implementation(root[1]));
    }

    public boolean isValidSerialization(String preorder) {
        String rest = implementation(preorder);
        return (rest != null && rest.isEmpty());
    }

}

package ru.vcrop;

/*Runtime: 2 ms, faster than 99.60% of Java online submissions for Serialize and Deserialize Binary Tree.
        Memory Usage: 48.3 MB, less than 80.40% of Java online submissions for Serialize and Deserialize Binary Tree.*/
public class Serialize_and_Deserialize_Binary_Tree_297 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private StringBuilder serializeImpl(TreeNode root, StringBuilder sb) {
        if (root == null) return sb.append("ZZ");
        sb.append((char) (root.val / 43 + 0x30)).append((char) (root.val % 43 + 0x30));
        serializeImpl(root.left, sb);
        return serializeImpl(root.right, sb);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return serializeImpl(root, new StringBuilder()).toString();
    }

    private TreeNode deserializeImpl(String date, int[] index) {
        if (date.charAt(index[0]) == 'Z' && date.charAt(index[0] + 1) == 'Z') {
            index[0] += 2;
            return null;
        }
        TreeNode ret = new TreeNode((date.charAt(index[0]) - 0x30) * 43 + (date.charAt(index[0] + 1) - 0x30));
        index[0] += 2;
        ret.left = deserializeImpl(date, index);
        ret.right = deserializeImpl(date, index);
        return ret;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return deserializeImpl(data, new int[]{0});
    }
}

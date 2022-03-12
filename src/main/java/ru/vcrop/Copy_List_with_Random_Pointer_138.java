package ru.vcrop;

import java.util.HashMap;
import java.util.Map;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Copy List with Random Pointer.
        Memory Usage: 41.9 MB, less than 85.36% of Java online submissions for Copy List with Random Pointer.*/
public class Copy_List_with_Random_Pointer_138 {

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

        public Node solution(Node current, Map<Node, Node> map) {
            if (current == null) return null;
            Node res = new Node(current.val);
            map.put(current, res);
            if (!map.containsKey(current.next)) res.next = solution(current.next, map);
            else res.next = map.get(current.next);
            if (!map.containsKey(current.random)) res.random = solution(current.random, map);
            else res.random = map.get(current.random);
            return res;
        };

        public Node copyRandomList(Node head) {
            return solution(head, new HashMap<>());
        }
}

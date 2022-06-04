package ru.vcrop;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*Runtime: 78 ms, faster than 81.58% of Java online submissions for LFU Cache.
        Memory Usage: 127.1 MB, less than 84.80% of Java online submissions for LFU Cache.*/
public class LFU_Cache_460 {

    int size = 0;
    int capacity;
    Map<Integer, Node> keys_node = new HashMap<>();
    Map<Integer, Node> count_node = new HashMap<>();

    public LFU_Cache_460(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (capacity == 0) return -1;
        if (!keys_node.containsKey(key)) return -1;
        keys_node.get(key).increment(key);
        return keys_node.get(key).elems.get(key);
    }

    public void put(int key, int value) {
        if (capacity != 0)
            if (keys_node.containsKey(key)) {
                keys_node.get(key).elems.remove(key);
                keys_node.get(key).elems.put(key, value);
                keys_node.get(key).increment(key);
            } else {
                if (size++ == capacity) {
                    int k = head.elems.keySet().iterator().next();
                    head.elems.remove(k);
                    keys_node.remove(k);
                    size--;
                }

                if (count_node.containsKey(1))
                    count_node.get(1).elems.put(key, value);
                else {
                    Node n = new Node();
                    n.count = 1;
                    n.next = head;
                    head = n;
                    n.elems.put(key, value);
                    count_node.put(1, n);
                }
                keys_node.put(key, count_node.get(1));
            }
    }

    Node head;

    public class Node {
        int count;
        Node next;
        Node pred;
        Map<Integer, Integer> elems = new LinkedHashMap<>();

        void increment(int key) {

            if (elems.size() == 1) {
                count_node.remove(count);
                if (count_node.containsKey(count + 1)) {
                    Node next = count_node.get(count + 1);
                    next.elems.put(key, elems.remove(key));
                    keys_node.remove(key);
                    keys_node.put(key, next);
                    if (head == this) head = next;
                    else {
                        this.pred.next = next;
                        next.pred = this.pred;
                    }
                } else {
                    count++;
                    count_node.put(count, this);
                }
            } else {
                if (count_node.containsKey(count + 1)) {
                    count_node.get(count + 1).elems.put(key, elems.remove(key));
                    keys_node.remove(key);
                    keys_node.put(key, count_node.get(count + 1));
                } else {
                    Node _new = new Node();
                    _new.count = this.count + 1;
                    _new.pred = this;
                    _new.next = this.next;
                    this.next = _new;
                    if (_new.next != null) _new.next.pred = _new;
                    _new.elems.put(key, this.elems.remove(key));
                    count_node.put(count + 1, _new);
                    keys_node.remove(key);
                    keys_node.put(key, _new);
                }
            }
        }

    }

}

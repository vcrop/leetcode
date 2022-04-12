package ru.vcrop;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Runtime: 2 ms, faster than 71.58% of Java online submissions for Keys and Rooms.
        Memory Usage: 45 MB, less than 30.76% of Java online submissions for Keys and Rooms.*/
public class Keys_and_Rooms_841 {

    private void implementation(int value, List<List<Integer>> rooms, Set<Integer> visited) {
        if (!visited.contains(value)) {
            visited.add(value);
            for (int next: rooms.get(value))
                implementation(next, rooms, visited);
        };
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        implementation(0, rooms, visited);
        return visited.size() == rooms.size();
    }
}

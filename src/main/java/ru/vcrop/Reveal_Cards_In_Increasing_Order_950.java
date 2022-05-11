package ru.vcrop;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*Runtime: 6 ms, faster than 31.62% of Java online submissions for Reveal Cards In Increasing Order.
        Memory Usage: 43.8 MB, less than 68.89% of Java online submissions for Reveal Cards In Increasing Order.*/
public class Reveal_Cards_In_Increasing_Order_950 {

    public int[] deckRevealedIncreasing(int[] deck) {

        Arrays.sort(deck);

        Deque<Integer> queue = new LinkedList<>();

        for (int i = deck.length - 1; i > -1; i--)
            if (queue.isEmpty()) queue.push(deck[i]);
            else {
                queue.push(queue.removeLast());
                queue.push(deck[i]);
            }

        for (int i = 0; i < deck.length; i++)
            deck[i] = queue.pop();

        return deck;

    }

}

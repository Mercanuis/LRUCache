package org.lru.cache;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache {

    static Deque<String> queue;

    static HashSet<String> keySet;

    static int capacity;

    public LRUCache(int cap) {
        queue = new LinkedList<>();
        keySet = new HashSet<>();
        capacity = cap;
    }

    public void checkCache(String x) {
        if(!keySet.contains(x)) {
            //check if cache is full, remove last if so
            if(queue.size() == capacity) {
                String last = queue.removeLast();
                keySet.remove(last);
            }
        } else {
            //Scan for the key in the set, and remove it from its spot in the queue
            String toFind = "";
            for (String s : queue) {
                if (s.equals(x)) {
                    toFind = s;
                    break;
                }
            }
            queue.remove(toFind);
        }

        //Add to cache, keep key in set
        queue.push(x);
        keySet.add(x);
    }

    public void display() {
        for(String s : queue) {
            System.out.print(s + " ");
        }
    }
}

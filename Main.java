package org.lru.cache;

public class Main {

    public static void main(String[] args) {
        LRUCache ca = new LRUCache(4);
        ca.checkCache("x");
        ca.checkCache("y");
        ca.checkCache("z");
        ca.checkCache("x");
        ca.checkCache("a");
        ca.checkCache("b");
        ca.display();
    }
}

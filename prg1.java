package com.basic.collection;

import java.util.HashMap;
import java.util.Map;

public class C09MapExample1 {
    public static void main(String[] args) {
        // Create a Map
        Map<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Print the Map
        System.out.println("Map: " + map);
    }
}

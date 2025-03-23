package com.basic.collection;

import java.util.HashMap;
import java.util.Map;

public class C09MapExample3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("baker", 25);
        map.put("Charlie", 35);

        // Using entrySet() to iterate over the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Iterating over keys
        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // Iterating over values
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }
    }
}

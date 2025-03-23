package com.basic.collection;
import java.util.HashMap;
import java.util.Map;

public class C09MapExample2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Get value by key
        String value = map.get(2);
        System.out.println("Value for key 2: " + value);

        // Check if a key exists
        boolean keyExists = map.containsKey(1);
        System.out.println("Key 1 exists: " + keyExists);

        // Check if a value exists
        boolean valueExists = map.containsValue("Banana");
        System.out.println("Value 'Banana' exists: " + valueExists);
    }
}

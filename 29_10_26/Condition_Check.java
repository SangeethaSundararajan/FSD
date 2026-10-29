package Day_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Condition_Check {

	public static void main(String[] args) {
		
		//HashSet
		HashSet<Integer> set = new HashSet<>();

        // 1. Test Insertion Order
        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println("Elements: " + set);
        
        // 2. Test Duplicate Elements
        set.add(10);
        System.out.println("After adding duplicate 10: " + set);
        System.out.println("Size: " + set.size());

        // 3. Test Sorting
        System.out.println("Before sorting: " + set);

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        System.out.println("After sorting: " + list);

        // 4. Test Null Elements
        set.add(null);
        System.out.println("After adding null: " + set);
        System.out.println("Contains null: " + set.contains(null));
        System.out.println("\n");

        
        
        //LinkedHashSet
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();

        set1.add(30);
        set1.add(10);
        set1.add(20);

        System.out.println("Insertion Order: " + set1);

        set1.add(10);
        System.out.println("Duplicate Test: " + set1);
        System.out.println("Size: " + set1.size());

        System.out.println("Sorting Supported: No");

        set1.add(null);
        System.out.println("Null Test: " + set1);
        System.out.println("Contains Null: " + set1.contains(null));
        System.out.println("\n");

        
        
        //TreeSet
        TreeSet<Integer> set2 = new TreeSet<>();

        set2.add(30);
        set2.add(10);
        set2.add(20);
        System.out.println("Sorted Elements: " + set2);

        set2.add(10);
        System.out.println("Duplicate Test: " + set2);
        System.out.println("Size: " + set2.size());

        try
        {
            set.add(null);
        } catch (NullPointerException e) 
        {
            System.out.println("Null Test: Not Allowed");
        }
        System.out.println("\n");

        
        
        //HashMap
        HashMap<Integer, String> map = new HashMap<>();

        map.put(3, "Apple");
        map.put(1, "Mango");
        map.put(2, "Apple");

        System.out.println("Map: " + map);
        
        map.put(1, "Orange");
        System.out.println("Duplicate Key Test: " + map);
        System.out.println("Size: " + map.size());

        map.put(null, "Banana");
        map.put(4, null);
        map.put(5, null);
        System.out.println("Map: " + map);

        System.out.println("Key Test: " + map.containsKey(null));
        System.out.println("Value Test: " + map.containsValue(null));

        System.out.println("Sorting Not Supported");
        System.out.println("\n");

        
        //LinkedHashMap
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();

        map1.put(3, "Apple");
        map1.put(1, "Mango");
        map1.put(2, "Apple");

        System.out.println("Insertion Order: " + map1);

        map1.put(1, "Orange");
        System.out.println("Duplicate Key Test: " + map1);
        System.out.println("Size: " + map.size());
        
        map1.put(null, "Banana");
        map1.put(4, null);
        map1.put(5, null);
        System.out.println("Insertion Order: " + map1);
        System.out.println("Size: " + map.size());


        System.out.println("Null Key Test: " + map1.containsKey(null));
        System.out.println("Null Value Test: " + map1.containsValue(null));

        System.out.println("Sorting Not Supported");
        System.out.println("\n");
        
        //TreeMap
        TreeMap<Integer, String> map3 = new TreeMap<>();

        map3.put(3, "Apple");
        map3.put(1, "Mango");
        map3.put(2, "Apple");

        System.out.println("Sorted Keys: " + map3);

        map3.put(1, "Orange");
        System.out.println("Duplicate Key Test: " + map3);
        System.out.println("Size: " + map3.size());

        System.out.println("No null keys");

        map3.put(4, null);
        map3.put(5, null);
        System.out.println("Sorted Keys: " + map3);

        System.out.println("Null Values Allowed: " +
                           map3.containsValue(null));
	}


}

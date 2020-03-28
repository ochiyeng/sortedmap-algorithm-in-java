package com.datastructure;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class SortMapByValue {

    public static void main(String[] args) {
        Map<String, String> unsortMap = new HashMap<String, String>();
        unsortMap.put("J", "j");
        unsortMap.put("A", "a");
        unsortMap.put("V", "v");
        unsortMap.put("C", "c");
        unsortMap.put("M", "m");
        unsortMap.put("F", "f");
        unsortMap.put("Y", "y");
        unsortMap.put("T", "t");
        unsortMap.put("E", "e");
        unsortMap.put("B", "b");

        System.out.println("UnsortMap: .......................................");
        printMap(unsortMap);
        System.out.println("\n=================================================");

        System.out.println("\nSorted Map....................-> by (key)");
        Map<String, String> treeMap = new TreeMap<String, String>(unsortMap);
        printMap(treeMap);

    }

    /*
    print a map
     */
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key:   " + entry.getKey() + " Value:   " + entry.getValue());
        }
    }


















}
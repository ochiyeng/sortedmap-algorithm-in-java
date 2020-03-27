package com.datastructure;

import java.util.HashMap;
import java.util.Map;

public class SortMapByValue {
    public static void main(String[] args){
        Map initialMap = new HashMap<>();
        initialMap.put("J", 10);
        initialMap.put("A" , 5);
        initialMap.put("V", 6);
        initialMap.put("C", 20);
        initialMap.put("O", 8);
        initialMap.put("R", 99);
        initialMap.put("E", 9);

        System.out.println("initialMap:  " + initialMap);
        Map sortedMap = SortMapByValue(initialMap);
        System.out.println("sortedMap: " + sortedMap);
    } 
}

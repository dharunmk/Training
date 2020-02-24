package com.training.cts;
import java.util.*;
public class Hashmap {

public static HashMap<String, String> sortByValue(HashMap<String, String> hm) 
{ 

    List<Map.Entry<String, String>> list =new LinkedList<Map.Entry<String, String>>(hm.entrySet()); 

    Collections.sort(list, new Comparator<Map.Entry<String, String> >() { 
        public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) 
        { 
            return (o1.getValue()).compareTo(o2.getValue()); 
        } 
    }); 

    HashMap<String, String> temp = new LinkedHashMap<String, String>(); 
    for (Map.Entry<String, String> aa : list) { 
        temp.put(aa.getKey(), aa.getValue()); 
    } 
    return temp; 
} 

public static void main(String[] args) 
{  

    HashMap<String, String> hm = new HashMap<String, String>(); 

    hm.put("United states of America", "New york"); 
    hm.put("Australia", "Melbourne"); 
    hm.put("India", "Delhi");
    hm.put("Russia", "Ukrane"); 
    hm.put("Tamilnadu", "Chennai"); 
    Map<String, String> hm1 = sortByValue(hm); 
    System.out.println("Sorting by Value of the HashMap :");
    System.out.println();
    for (Map.Entry<String, String> en : hm1.entrySet()) { 
        System.out.println("Key: " + en.getKey() + ", Values: " + en.getValue()); 
    } 
} 
} 
package com.demo.project;

import java.util.HashMap;

public class Anagram {

    public boolean getAnagram(String a, String b){

        //Modify all the characters into lower case
        a.toLowerCase();
        b.toLowerCase();

        //remove space in the String
        a = a.replaceAll("\\s", "");
        b = b.replaceAll("\\s", "");

        int aLength = a.length();
        int bLength = b.length();

        //if the length of the new string is not the same, the are definitely not anagram
        if(aLength != bLength){
            return false;
        }

        //use HashMap to store the frequency of certain character
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        //looping through first string and then record the sequnce of those characters
        for(char c : a.toCharArray()){
            //if we can find the character in the map, add it
            if(map1.get(c) == null){
                map1.put(c, 1);
            }else{
                map1.put(c, map1.get(c) + 1);
            }
        }

        //perform the same action on the second string
        for(char c : b.toCharArray()){
            //if we can find the character in the map, add it
            if(map2.get(c) == null){
                map2.put(c, 1);
            }else{
                map2.put(c, map2.get(c) + 1);
            }
        }

        for(char c : map1.keySet()){
            if(map2.containsKey(c)){
                if(map1.get(c) == map2.get(c)){
                    return true;
                }
            }
        }

        return false;
    }

}

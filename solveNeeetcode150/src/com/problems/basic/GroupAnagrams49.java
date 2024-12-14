package com.problems.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams49 {
	private static final int ALPHABET_COUNT = 26;

	
	 public static List<List<String>> groupAnagrams(String[] strs) {
	        
	        if(strs.length == 0){
	            return Collections.emptyList();
	        }
	        
	        Map<String, List<String>> ansMap = new HashMap<>();
	        
	        int[] count = new int[ALPHABET_COUNT];
	        
	        for(String s:strs){
	        	// construct positional array where element presents
	            Arrays.fill(count, 0);
	            for(char c:s.toCharArray()){
	                count[c-'a']++;
	            }
	            
	            System.out.println(Arrays.toString(count));
	            
	            StringBuilder keyBuilder = new StringBuilder();
	            
	            for(int i=0; i<26; i++){
	            	keyBuilder.append(count[i]).append('#');;
	            }
	            String key = keyBuilder.toString();
	            //ansMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
	            
	         //Step 1: Check if the key is absent and create a new list if it is
	         if (!ansMap.containsKey(key)) { 
	        	 ansMap.put(key, new ArrayList<>()); 
	         } 
	         // Step 2: Add the string to the list associated with the key
	         ansMap.get(key).add(s);
	            
	        }
	        
	        System.out.println(ansMap);
	        
	        return new ArrayList(ansMap.values());
	        
	    }
	 
	 
	 public static void main(String[] args) {
		 
		 String [] inputArr = {"bat","nat", "tab","atb", "tan", "abc"};
		List<List<String>> output =  groupAnagrams(inputArr);
		System.out.println(output);
		
	}
	 
	 
	 

}

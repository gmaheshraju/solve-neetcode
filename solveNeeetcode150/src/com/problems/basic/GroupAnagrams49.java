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
	            Arrays.fill(count, 0);
	            for(char c:s.toCharArray()){
	                count[c-'a']++;
	            }
	            
	            StringBuilder keyBuilder = new StringBuilder();
	            
	            for(int i=0; i<26; i++){
	            	keyBuilder.append(count[i]).append('#');;
	            }
	            String key = keyBuilder.toString();
	            ansMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
	            
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

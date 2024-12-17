package com.repeat.solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	
	//delcare constants
	
	public static final int ALPHABETS_COUNT = 26;
	
	public static List<List<String>> groupAnagrams(String[] str){
		
		//edge cases
		if(str.length ==0) {
			return Collections.emptyList();
		}
		
		//define the input data elements
		Map<String, List<String>> ansMap = new HashMap<>();
	    int[] count = new int[ALPHABETS_COUNT];
		
		for(String s: str) {
			Arrays.fill(count, 0);
			for(char c: s.toCharArray()) {
				count[c-'a']++;
			}
			 StringBuilder keyBuilder = new StringBuilder();
	            
            for(int i=0; i<26; i++){
            	keyBuilder.append(count[i]).append('#');;
            }
            String key = keyBuilder.toString();
			
            
            if(!ansMap.containsKey(key)) {
            	ansMap.put(key, new ArrayList<>());
            }
            
            ansMap.get(key).add(s);
		}
		return new ArrayList(ansMap.values());
		
		
	}
	
	public static void main(String[] args) {
		
		String [] inputArr = {"bat" , "tab","abc", "tan","net","nat"};
		List<List<String>> result = groupAnagrams(inputArr);
		System.out.println(result);
		
	}

}

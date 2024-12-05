package com.problems.basic;

public class Anagram {
	
	public static void main(String[] args) {
		
		
		String second = "ratc";
		String first = "catr";
		boolean result = validAnagram(first,second);
		System.out.println(result);
	}

	private static boolean validAnagram(String first, String second) {
		
	    //  check the length and return
		
		if(first.length() != second.length())
			return false;
		
		int[] charCounts = new int[26];
		
		//character frequency 
		
		for(int i=0; i< first.length(); i++) {
			charCounts[first.charAt(i) - 'a']++;
			charCounts[second.charAt(i) - 'a']--;
		}
		
		
		
		
		//check if anything left over in array with value other than zero
		for(int count : charCounts) {
			
			if(count != 0) {
				return false;
			}
		}
		
		return true;
	}

}

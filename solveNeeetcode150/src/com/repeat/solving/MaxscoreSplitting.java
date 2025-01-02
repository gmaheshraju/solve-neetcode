package com.repeat.solving;

public class MaxscoreSplitting {
	
	public static int maxScore(String s) {
		if(s.length() ==1) {
			return 1;
		}
       
        return 0;
    }
	
	public static void main(String[] args) {
		String s ="001111";
		int result = maxScore(s);
		System.out.println(result);
	}

}

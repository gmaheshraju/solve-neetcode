package com.problems.basic;

public class ValidPalindrome {

	public static boolean isPalindrome(String s) {

		if (s.isEmpty()) {
			return true;
		}
		String lowerCaseinput = s.toLowerCase();
		int left = 0;
		int right = s.length() - 1;
		while (left <= right) {

			if (!Character.isLetterOrDigit(lowerCaseinput.charAt(left))) {
				left++;
			} else if (!Character.isLetterOrDigit(lowerCaseinput.charAt(right))) {
				right--;
			} else {
				if (lowerCaseinput.charAt(left) != lowerCaseinput.charAt(right)) {
					return false;
				}
				left++;
				right--;
			}

		}

		return true;

	}

	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";

		boolean result = isPalindrome(str);
		System.out.println(result);
	}

}

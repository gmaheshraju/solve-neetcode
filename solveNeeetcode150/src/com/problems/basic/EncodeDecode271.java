package com.problems.basic;

import java.util.ArrayList;

import java.util.List;

public class EncodeDecode271 {

	// Encodes a list of strings to a single string
	public String encode(List<String> strs) {
		StringBuilder encoded = new StringBuilder();
		for (String s : strs) {
			// Append length of string, delimiter, and the string itself
			encoded.append(s.length()).append("#").append(s);
		}
		return encoded.toString();
	}

	// Decodes a single string to a list of strings
	public List<String> decode(String s) {
		List<String> decoded = new ArrayList<>();
		int i = 0;

		while (i < s.length()) {
			// Extract the length part (up to the delimiter)
			int delimiterIndex = s.indexOf('#', i);
			int wordlength = Integer.parseInt(s.substring(i, delimiterIndex));

			// Extract the string of the given length
			String str = s.substring(delimiterIndex + 1, delimiterIndex + 1 + wordlength);
			decoded.add(str);

			// Move the pointer past the processed string
			i = delimiterIndex + 1 + wordlength;
		}
		return decoded;
	}

	// Testing the Code
	public static void main(String[] args) {
		EncodeDecode271 obj = new EncodeDecode271();

		int res = Integer.parseInt("5");
		System.out.println(res);

		// Example usage
		List<String> input = List.of("helloerteryery", "world", "java", "leetcode");
		System.out.println("Original List: " + input);

		String encoded = obj.encode(input);
		System.out.println("Encoded String: " + encoded);

		List<String> decoded = obj.decode(encoded);
		System.out.println("Decoded List: " + decoded);
	}

}

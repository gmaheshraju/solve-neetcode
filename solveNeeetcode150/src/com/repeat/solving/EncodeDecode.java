package com.repeat.solving;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
	// Encodes a list of strings to a single string
	public String encode(List<String> strs) {
		StringBuilder encoded = new StringBuilder();

		for (String s : strs) {
			encoded.append(s.length()).append("#").append(s);
		}

		return encoded.toString();
	}

	// Decodes a single string to a list of strings
	public List<String> decode(String s) {
		List<String> decoded = new ArrayList<>();

		int i = 0;

		while (i < s.length()) {
			int delimiterIndex = s.indexOf('#', i);

			int wordLength = Integer.parseInt(s.substring(i, delimiterIndex));
			int start = delimiterIndex + 1;
			int end = start + wordLength;
			String word = s.substring(start, end);
			decoded.add(word);
			i = start + wordLength;

		}

		return decoded;
	}

	// Testing the Code
	public static void main(String[] args) {
		EncodeDecode obj = new EncodeDecode();

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

package com.problems.basic;

import java.util.HashSet;

public class ValidSudoku {
	
	public static final int LENGTH = 9;
	
	public static void main(String[] args) {
		
		char[][] input = {{'5','3','.','.','7','.','.','.','.'}
						,{'6','.','.','1','9','5','.','.','.'}
						,{'.','9','8','.','.','.','.','6','.'}
						,{'8','.','.','.','6','.','.','.','3'}
						,{'4','.','.','8','.','3','.','.','1'}
						,{'7','.','.','.','2','.','.','.','6'}
						,{'.','6','.','.','.','.','2','8','.'}
						,{'.','.','.','4','1','9','.','.','5'}
						,{'.','.','.','.','8','.','.','7','9'}};
		
		boolean result = isValidSudoku(input);
		System.out.println(result);
	}

	public static  boolean isValidSudoku(char[][] board) {
		

		// Use hash set to record the status
		HashSet<Character>[] rows = new HashSet[LENGTH];
		HashSet<Character>[] cols = new HashSet[LENGTH];
		HashSet<Character>[] boxes = new HashSet[LENGTH];
		//initialize Hashset
		for (int r = 0; r < LENGTH; r++) {
			rows[r] = new HashSet<Character>();
			cols[r] = new HashSet<Character>();
			boxes[r] = new HashSet<Character>();
		}

		for (int r = 0; r < LENGTH; r++) {
			for (int c = 0; c < LENGTH; c++) {
				char val = board[r][c];

				// Check if the position is filled with number
				if (val == '.') {
					continue;
				}

				// Check the row
				if (rows[r].contains(val)) {
					return false;
				}
				rows[r].add(val);

				// Check the column
				if (cols[c].contains(val)) {
					return false;
				}
				cols[c].add(val);

				// Check the box
				int idx = (r / 3) * 3 + c / 3;
				if (boxes[idx].contains(val)) {
					return false;
				}
				boxes[idx].add(val);
			}
		}
		return true;
	}

}

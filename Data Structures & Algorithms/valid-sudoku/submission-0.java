class Solution {
    public boolean isValidSudoku(char[][] board) {
    	List<HashSet<Integer>> colList = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			colList.add(i, new HashSet<Integer>());
		}
		List<HashSet<Integer>> sectorList = new ArrayList<>();
		for (int j = 0; j < 9; j++) {
			sectorList.add(j, new HashSet<Integer>());
		}
		
		for (int r = 0; r < 9; r++) {
			HashSet<Integer> rowSet= new HashSet<>(); 
			for (int c = 0; c < 9; c++) {
				if (board[r][c] == '.') continue; //no need to check an empty space.
				
				int num = board[r][c] - '0';
				//checks if col has this number before.
				if (colList.get(c).contains(num)) {
					return false;
				} else {
					colList.get(c).add(num);
				}
				
				//checks if row has seen this number before
				if (rowSet.contains(num)) {
					return false;
				} else {
					rowSet.add(num);
				}
				
                //checks the sector
				int sector = (r / 3) * 3 + (c / 3);
				if (sectorList.get(sector).contains(num)) {
					return false;
				} else {
					sectorList.get(sector).add(num);
				}
			}
		}
		
		return true;
	}
}

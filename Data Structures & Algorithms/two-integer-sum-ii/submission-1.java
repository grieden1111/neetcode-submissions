class Solution {
    public int[] twoSum(int[] numbers, int target) {	
		int l = 0;
		int r = numbers.length - 1;
		
		while (true) {
			int lNum = numbers[l];
			int rNum = numbers[r];
			if (lNum + rNum == target) return new int []{++l, ++r};
			if (lNum + rNum < target) {
				l++;
			} else r--;
		}
    }
}

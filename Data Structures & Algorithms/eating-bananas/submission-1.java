class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int length = piles.length;
		//where n comes from (but gets swamped by nlog(m) later so doesn't matter
		int max = 0;
		for (int i = 0; i < length; i++) {
			if (piles[i] > max) max = piles[i];
		}
		
		//so now we have to go from 1 to max, fine tuning the eating speed;
		//keep repeating as we find the best solution
        //where nlog(m) comes from (log(m) for binarySearch(outer loop) and n for inner forloop)
		int bestK = max;
		int l = 1, r = max;
		while (l <= r) {
			int k = (l + r) / 2;
			int remainingHours = h;
			for (int j = 0; j < length; j++) {
				remainingHours -= Math.ceil((double) piles[j] / k);
			}
			if (remainingHours < 0) l = k + 1;
			else {bestK = k; r = k - 1;}
		}
		return bestK;
    }
}

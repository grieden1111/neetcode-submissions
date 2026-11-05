class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        		
		TreeMap<Integer, Integer> sortedMap = new TreeMap<>(Collections.reverseOrder());
		
		int length = position.length;
		//adds entries to treemap, and when moving through the map, we get reverse order based on position (so closest
		// to target will be looked at first
		for (int i = 0; i < length; i++) {
			sortedMap.put(position[i], speed[i]);
		}
		
		//look at entries in treemap, seeing if they will merge before target
		int key = sortedMap.firstKey();
		double previousTime = (double) (target - key) / sortedMap.get(key);
		int fleetCounter = 1;
		for (Map.Entry<Integer, Integer> car : sortedMap.entrySet()) {
			//skips the first pair (dont know how to skip this, maybe i could remove the pairing before loop
			if (key == car.getKey()) continue;
			double currentTime = (double) (target - car.getKey()) / car.getValue();
			if (currentTime > previousTime) {
				fleetCounter++;
				previousTime = currentTime;
			}
		}
		return fleetCounter;
		
		
	}
    
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;
        int s = 0; // surplus
        int d = 0; // deficit
        int startStation = 0;

        for(int i = 0; i < n; i++){
            // adding gas from giving station
            s += gas[i];
            
            if(s >= cost[i]){
                // posiblility of answer in this station(if it does not get into deficit)
                s -= cost[i];
            }
            else{
                // reset s to 0 and check for next startStation
                d += cost[i] - s;
                s = 0;
                startStation = i + 1;
            }
        }
        // System.out.println(d);  -> 6
        if(s >= d)
          return startStation;
        return -1;
        
    }
}
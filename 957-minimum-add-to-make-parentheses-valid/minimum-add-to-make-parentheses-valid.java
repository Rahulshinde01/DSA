class Solution {
    public int minAddToMakeValid(String s) {
        int openNeeded = 0;    // count of '(' needed
        int closeNeeded = 0;   // count of ')' needed
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                closeNeeded++;
            } else {  // c is ')'
                if (closeNeeded == 0) {
                    openNeeded++;
                } else {
                    closeNeeded--;
                }
            }
        }
        
        return openNeeded + closeNeeded;
    }
}
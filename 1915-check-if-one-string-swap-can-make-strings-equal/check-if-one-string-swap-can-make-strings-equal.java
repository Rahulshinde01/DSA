class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        int len = s1.length();
        int charInd = 0;
        int[] charIndArr = new int[2];
        for(int i = 0; i < len; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if(ch1 != ch2){
                if(charInd >= 2){
                    return false;
                }

                charIndArr[charInd] = i;
                charInd++;
                
            }            
        }
        

        if(charInd == 2){
            
            return s1.charAt(charIndArr[0]) == s2.charAt(charIndArr[1]) && s1.charAt(charIndArr[1]) == s2.charAt(charIndArr[0]) ? true : false;
        }
        return false;


        
    }
}
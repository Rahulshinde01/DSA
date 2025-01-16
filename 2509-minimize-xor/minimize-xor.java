class Solution {
    public int setBitCount(int n){
        int setBits = 0;
        while(n > 0){
            if((n & 1) != 0){
                setBits++;
            }

            n = n>>1;
        }

        return setBits;
    }
    public int minimizeXor(int num1, int num2) {

        int setBits2 = setBitCount(num2);
        int setBits1 = setBitCount(num1);
        int x = num1;

        if(setBits1 < setBits2){
            int bit = 0;
            for(int i = 0; i < (setBits2 - setBits1); i++){
                while((x & (1<<bit)) != 0){
                    bit++;
                }
                x = x | (1<<bit);
            }
        }
        else if(setBits1 > setBits2){
            int bit = 0;
            for(int i = 0; i < (setBits1 - setBits2); i++){
                while((x & (1<<bit)) == 0){
                    bit++;
                }
                x = x & ~(1<<bit);
            }
        }
        

        return x;
        
    }
}
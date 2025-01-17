class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int len = derived.length;
        int[] arr = new int[len];
        arr[0] = 0;

        for(int i = 0; i < len - 1; i++){
            int bit = derived[i];
            arr[i + 1] = arr[i] ^ bit;
        }

        if((arr[len - 1] ^ arr[0]) == derived[len - 1]){
            return true;
        }
        else{
            return false;
        }
    }
}
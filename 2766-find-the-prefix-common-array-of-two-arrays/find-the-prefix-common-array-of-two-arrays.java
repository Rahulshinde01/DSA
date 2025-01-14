class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length;

        int[] ans = new int[len];
        int count = 0;

        Set<Integer> set = new HashSet<>();

        set.add(A[0]);
        if(set.contains(B[0])){
                count++;
                ans[0] = count;
        }
        else{
            set.add(B[0]);
            ans[0] = 0;
        }

        for(int i = 1; i < len; i++){
            if(set.contains(B[i])){
                count++;
            }
            else{
                set.add(B[i]);
            }

            if(set.contains(A[i])){
                count++;
            }
            else{
                set.add(A[i]);
            }

            ans[i] = count;
        }

        return ans;
    }
}
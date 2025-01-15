class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a , b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();

        int start = arr[0][0];
        int end = arr[0][1];
        for(int[] x : arr){
            if(x[0] >= start && x[0] <= end){
                end = Math.max(x[1], end);
            }
            else{
                ans.add(new int[]{start, end});
                start = x[0];
                end = x[1];
            }
        }

        ans.add(new int[]{start, end});


        return ans.toArray(new int[ans.size()][2]);
    }
}
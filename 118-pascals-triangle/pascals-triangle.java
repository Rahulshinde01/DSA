class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        // for numRow == 1 
        list.add(1);
        ans.add(list);

        for(int i = 1; i < numRows; i++){
            list = new ArrayList<>(i + 1);
            int j = 0;

            while(j <= i){ 
                if(j == 0 || j == i){
                    list.add(1);
                }else{
                    int first = ans.get(i - 1).get(j - 1);
                    int sec = ans.get(i - 1).get(j);

                    list.add(first + sec);
                }
                j++;
            }

            ans.add(list);
            
        }

        return ans;
    }
}
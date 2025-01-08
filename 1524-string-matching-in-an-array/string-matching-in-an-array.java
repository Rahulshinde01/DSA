class Solution {
    public List<String> stringMatching(String[] words) {
        int len = words.length;
        List<String> ans = new ArrayList<>();

        for(int i = 0; i < len; i++){
            String str = words[i];
            for(int j = 0; j < len; j++){
                String word = words[j];

                if(i != j && word.contains(str)){
                    ans.add(str);
                    break;
                }
            }
        }

        return ans;
    }
}
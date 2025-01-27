class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        Map<Integer, Boolean> map = new HashMap<>();
        int len = graph.length;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < len; i++){
            if(dfs(i, graph, map)){
                list.add(i);
            }
        }

        return list;
    }
    public boolean dfs(int node, int[][] graph, Map<Integer, Boolean> map){
        if(map.containsKey(node)){
            return map.get(node);
        }

        map.put(node, false);

        for(int neighbour: graph[node]){
            if(!dfs(neighbour, graph, map)){
                return false;
            }
        }

        map.put(node, true);

        return true;
    }
}
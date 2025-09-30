class Solution {
    public int findCircleNum(int[][] isConnected) {
       int n = isConnected.length;

       ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
       for(int i=0;i<n;i++){
        adjList.add(new ArrayList<Integer>());
       }

       for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(isConnected[i][j] == 1 && i!=j){
                adjList.get(i).add(j);
                adjList.get(j).add(i);
            }
        }
       }
       int vis[] = new int[n];
       int noc = 0;
       for(int i=0;i<n;i++) {
        if(vis[i]==0) {
            noc++;
            dfs(i, adjList, vis);
        }
       }
       return noc;

    }

    public void dfs(int node, ArrayList<ArrayList<Integer>> adjList, int vis[]){
        System.out.println(node);
        vis[node] = 1;
        for(Integer it:adjList.get(node)) {
            if(vis[it] == 0) {
                System.out.println(it);
                dfs(it, adjList, vis);
            }
        }
    }
}
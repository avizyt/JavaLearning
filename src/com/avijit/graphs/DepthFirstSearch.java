package com.avijit.graphs;

public class DepthFirstSearch {
    private boolean[] marked;
    private int count;

    public DepthFirstSearch(Graph g, int s) {
        marked = new boolean[g.V()];
        dfs(g, s);
    }

    private void dfs(Graph g, int v){
        marked[v] = true;
        count++;
        for (int w :
                g.adj[v])   {
            if (!marked[w]){
                dfs(g, w);
            }
        }
    }

    public boolean marked(int v){
        return marked[v];
    }
    public int count(){
        return count;
    }
    @Override
    public String toString(){
        String s = "";
        for (int v = 0; v < marked.length; v++) {
            s += v + ": " + marked[v] + "\n";
        }
        return s;
    }


    // main
    public static void main(String[] args) {
        Graph g = new Graph(10);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 5);
        g.addEdge(5, 2);
        g.addEdge(5, 4);
        g.addEdge(4, 3);
        g.addEdge(4, 5);
        g.addEdge(4, 6);
        g.addEdge(6, 0);
        g.addEdge(6, 4);

        System.out.println(g);
        System.out.println("=====================");
        DepthFirstSearch search = new DepthFirstSearch(g, 5);
        System.out.println(search);
    }
}

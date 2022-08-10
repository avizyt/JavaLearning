package com.avijit.graphs;

public class DirectedDFS {
    private boolean[] marked;
    public DirectedDFS(Digraph g, int s){
        marked = new boolean[g.V()];
        dfs(g, s);
    }

    public DirectedDFS(Digraph g, Iterable<Integer> sources){
        marked = new boolean[g.V()];
        for (int s : sources) {
             if (!marked[s]) {
                dfs(g, s);
            }
        }
    }

    private void dfs(Digraph g, int v){
        marked[v] = true;
        for (int w : g.adj[v]){
            if (!marked[w]){
                dfs(g, w);
            }
        }
    }
    public boolean marked(int v){
        return marked[v];
    }
    @Override
    public String toString(){
        String s = "";
        for (int v = 0; v < marked.length; v++) {
            s += v + ": " + marked[v] + "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        Digraph g = new Digraph(22);
        g.addEdge(4, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 2);
        g.addEdge(6, 0);
        g.addEdge(0, 1);
        g.addEdge(2, 0);
        g.addEdge(11, 12);
        g.addEdge(12, 9);
        g.addEdge(9, 10);
        g.addEdge(9, 11);
        g.addEdge(7, 9);
        g.addEdge(10, 12);
        g.addEdge(11, 4);
        g.addEdge(4, 3);
        g.addEdge(3, 5);
        g.addEdge(6, 8);
        g.addEdge(8, 6);
        g.addEdge(5, 4);
        g.addEdge(6, 4);
        g.addEdge(6, 9);
        g.addEdge(7, 6);

        DirectedDFS dfs = new DirectedDFS(g, 5);
        System.out.println(dfs);
    }
}

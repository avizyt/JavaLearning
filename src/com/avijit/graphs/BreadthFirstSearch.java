package com.avijit.graphs;

import java.util.LinkedList;

public class BreadthFirstSearch {
    private static boolean[] marked;
    private static int count;

    public BreadthFirstSearch(Graph g, int s) {
        marked = new boolean[g.V()];
        bfs(g, s);
    }

    private void bfs(Graph g, int s) {
        LinkedList<Integer> queue = new LinkedList<>();
        marked[s] = true;
        queue.add(s);
        while (!queue.isEmpty()) {
            int v = queue.remove();
            count++;
            for (int w : g.adj[v]) {
                if (!marked[w]) {
                    marked[w] = true;
                    queue.add(w);
                }
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

    public static void main(String[] args) {
        Graph g = new Graph(12);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 5);
        g.addEdge(1, 2);
        g.addEdge(1, 0);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 2);
        g.addEdge(3, 4);
        g.addEdge(5, 3);
        g.addEdge(5, 0);
        g.addEdge(4, 5);

        System.out.println(g);
        System.out.println("=====================");
        BreadthFirstSearch search = new BreadthFirstSearch(g, 5);
        System.out.println(search);
    }
}

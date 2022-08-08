package com.avijit.graphs;

import java.util.LinkedList;

public class DepthFirstPaths {

    private static boolean[] marked;
    private static int[] edgeTo;
    private static int source;
    public DepthFirstPaths( Graph g, int s) {
        marked = new boolean[g.V()];
        edgeTo = new int[g.V()];
        this.source = s;
        dfs(g, s);
    }

    private void dfs(Graph g, int v){
        marked[v] = true;
        for (int w :
                g.adj[v])   {
            if (!marked[w]){
                edgeTo[w] = v;
                dfs(g, w);
            }
        }
    }

    public static boolean hasPathTo(int v){
        return marked[v];
    }

    public static Iterable<Integer> pathTo(int v){
        if (!hasPathTo(v)){
            return null;
        }
        LinkedList<Integer> path = new LinkedList<>();
        for (int x = v; x != source; x = edgeTo[x]){
            path.addFirst(x);
        }
        path.addFirst(source);
        return path;
    }

    // method to print the path
    public static void printPath(int v){
        if (!hasPathTo(v)){
            System.out.println("No path from " + source + " to " + v);
            return;
        }
        System.out.println("Path from " + source + " to " + v);
        for (int x :
                pathTo(v)) {
            System.out.print(x + " ");
        }
        System.out.println();
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
        DepthFirstPaths search = new DepthFirstPaths(g, 5);
        printPath(2);
        printPath(4);
    }
}

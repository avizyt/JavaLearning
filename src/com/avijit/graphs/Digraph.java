package com.avijit.graphs;

import java.util.LinkedList;

public class Digraph {
    private final int V;
    private int E;
    private LinkedList<Integer> adj[];

    public Digraph(int V) {
        this.V = V;
        this.E = 0;
        adj = new LinkedList[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }
    public int V() {
        return V;
    }
    public int E() {
        return E;
    }
    public void addEdge(int v, int w){
        adj[v].add(w);
        E++;
    }
    public Iterable<Integer> adj(int v){
        return adj[v];
    }
    public Digraph reverse(){
        Digraph r = new Digraph(V);
        for (int v = 0; v < V; v++) {
            for (int w : adj(v)) {
                r.addEdge(w, v);
            }
        }
        return r;
    }

    @Override
    public String toString(){
        String s = V + " vertices, " + E + " edges\n";
        for (int v = 0; v < V; v++) {
            s += v + ": ";
            for (int w :
                    this.adj[v]) {
                s += w + " ";
            }
            s += "\n";
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

        System.out.println(g);
    }
}

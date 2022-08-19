package com.avijit.graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Digraph {
    private final int V;
    private int E;
    public LinkedList<Integer> adj[];

    public Digraph(int V) {
        if (V < 0) throw new IllegalArgumentException("Number of vertices must be nonnegative");
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

    public void validateVertex(int v) {
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    }
    public void addEdge(int v, int w){
        validateVertex(v);
        validateVertex(w);
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

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/resource/data/tinyDG.txt");
        Scanner sc = new Scanner(file);

        int V = sc.nextInt();
        Digraph G = new Digraph(V);
        int E = sc.nextInt();
        for (int i = 0; i < E; i++) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            G.addEdge(v, w);
        }
//        Digraph g = new Digraph(22);
//        g.addEdge(4, 2);
//        g.addEdge(2, 3);
//        g.addEdge(3, 2);
//        g.addEdge(6, 0);
//        g.addEdge(0, 1);
//        g.addEdge(2, 0);
//        g.addEdge(11, 12);
//        g.addEdge(12, 9);
//        g.addEdge(9, 10);
//        g.addEdge(9, 11);
//        g.addEdge(7, 9);
//        g.addEdge(10, 12);
//        g.addEdge(11, 4);
//        g.addEdge(4, 3);
//        g.addEdge(3, 5);
//        g.addEdge(6, 8);
//        g.addEdge(8, 6);
//        g.addEdge(5, 4);
//        g.addEdge(6, 4);
//        g.addEdge(6, 9);
//        g.addEdge(7, 6);

        System.out.println(G);
    }
}

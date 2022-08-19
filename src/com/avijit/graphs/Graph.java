package com.avijit.graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Graph {
    private int V;
    private int E;
    public LinkedList<Integer> adj[];

    public Graph(int V){
        this.V = V;
        this.E = 0;
        if (V < 0) throw new IllegalArgumentException("Number of vertices must be nonnegative");

        adj = new LinkedList[V];

        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    public Graph(Graph G){
        this.V = G.V();
        this.E = G.E();
        if (V < 0) throw new IllegalArgumentException("Number of vertices must be nonnegative");

        adj = new LinkedList[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }

        for (int v = 0; v < G.V(); v++) {
            // reverse so that adjacency list is in same order as original
            Stack<Integer> reverse = new Stack<Integer>();
            for (int w : G.adj[v]) {
                reverse.push(w);
            }
            for (int w : reverse) {
                adj[v].add(w);
            }
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
        E++;
        adj[v].add(w);
        adj[w].add(v);
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


    public void DFS_helper(int v, boolean visit[]){
        visit[v] = true;
        System.out.print(v+" ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()){
            int n = i.next();
            if (!visit[n]){
                DFS_helper(n, visit);
            }
        }
    }

    public void DFS(int v){
        boolean visit[] = new boolean[V];

        DFS_helper(v, visit);
    }
    public void BFS(int v){
        boolean[] visit = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<>();

        visit[v] = true;
        queue.add(v);

        while (queue.size() != 0){
            v = queue.poll();
            System.out.print(v+" ");

            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!visit[n]){
                    visit[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/resource/data/tinyG.txt");
        Scanner sc = new Scanner(file);

        int V = sc.nextInt();
        int E = sc.nextInt();
        Graph G = new Graph(V);
        for (int i = 0; i < E; i++) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            G.addEdge(v, w);
        }

//        Graph g = new Graph(10);
//        g.addEdge(0, 1);
//        g.addEdge(0, 2);
//        g.addEdge(0, 5);
//        g.addEdge(5, 2);
//        g.addEdge(5, 4);
//        g.addEdge(4, 3);
//        g.addEdge(4, 5);
//        g.addEdge(4, 6);
//        g.addEdge(6, 0);
//        g.addEdge(6, 4);


        System.out.println(G);

//        System.out.println("=============Depth First Search==========");
//        G.DFS(0);
//        System.out.println();
//        System.out.println("=============Breadth First Search==========");
//        G.BFS(0);
    }



}

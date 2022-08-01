package com.avijit.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int V;
    private int E;
    private LinkedList<Integer> adj[];

    public Graph(int V){
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

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 4);

        System.out.println("=============Depth First Search==========");
        g.DFS(0);
        System.out.println();
        System.out.println("=============Breadth First Search==========");
        g.BFS(0);
    }



}

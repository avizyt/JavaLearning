package com.avijit.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int V;
    private int E;
    public LinkedList<Integer> adj[];

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

        System.out.println("=============Depth First Search==========");
        g.DFS(0);
        System.out.println();
        System.out.println("=============Breadth First Search==========");
        g.BFS(0);
    }



}

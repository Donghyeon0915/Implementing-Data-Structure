/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;

/**
 *
 * @author Donghyeon <20183188>
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Graph g = new Graph(9);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);

        g.addEdge(2, 4);
        g.addEdge(2, 3);

        g.addEdge(3, 4);
        g.addEdge(3, 5);

        g.addEdge(5, 6);
        g.addEdge(5, 7);
        g.addEdge(6, 8);
        
        DFS d = new DFS(g);
        d.dfs();
    }

}

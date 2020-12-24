/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs;

/**
 *
 * @author Donghyeon <20183188>
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    
    /* Graph
        0
       /
      1 -- 3    7
      |  / | \ /
      | /  |  5
      2 -- 4   \
                6 - 8
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Graph g = new Graph(9);
        // 노드 추가는 왼쪽 노드 우선(연결된 노드가 여러개일때)
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

        BFS b = new BFS(g);
        b.bfs();
    }
    
}

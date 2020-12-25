/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Donghyeon <20183188>
 */
public class BFS {
    
    Graph graph;

    public BFS(Graph graph) {
        this.graph = graph;
    }
    
    
    public void bfs(){
        bfs(0);
    }
    
    public void bfs(int root){
        Node r = graph.nodes[root];      //루트 노드 가져옴
        Queue<Node> queue = new LinkedList<>();
        queue.add(r);
        r.visited = true;
        
        while(!queue.isEmpty()){
            Node now = queue.poll();     //현재 방문한 노드
            now.adjacent.stream().filter(node -> (!node.visited)).map(node -> { //연결 된 노드 중 방문하지 않은 노드들만 삽입
                queue.add(node);                                                //현재 방문한 노드와 연결된 노드들을 큐에 삽입
                return node;
            }).forEachOrdered(node -> {                                         
                node.visited = true;                                            //방문 체크
            }); 
            
//            for (Node node : queue) {
//                if(!node.visited){
//                    queue.add(node);
//                    node.visited = true;
//                }
//            }
            System.out.print(now.data + " ");
        }
    }
}

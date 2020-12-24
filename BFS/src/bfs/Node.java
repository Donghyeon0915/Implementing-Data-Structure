/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs;

import java.util.LinkedList;

/**
 *
 * @author Donghyeon <20183188>
 */
public class Node {
    int data;
    LinkedList<Node> adjacent;
    boolean visited;
    
    public Node(int data){
        this.data = data;
        this.adjacent = new LinkedList<>();          //인접한 노드들과의 관계를 리스트로 표현
        this.visited = false;                    //방문 여부 체크
    }
    
}

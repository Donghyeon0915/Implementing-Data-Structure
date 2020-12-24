/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;

import java.util.LinkedList;

/**
 *
 * @author Donghyeon <20183188>
 */

public class Graph{
    
    Node[] nodes;                           //노드들을 저장할 배열 (노드끼리의 연결 관계는 각자의 노드에서 list로 저장되어있음)
    
    Graph(int size){
        nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i);         //편의를 위해 데이터와 노드의 번호를 동일하게 설정
        }
    }
    
    void addEdge(int d1, int d2){
        Node n1 = nodes[d1];                //데이터와 인덱스가 같으므로 매개변수로 받은 값을 인덱스로 사용 가능
        Node n2 = nodes[d2];
        
        if(!n1.adjacent.contains(n2)){      //두 개의 노드의 인접 관계를 저장하는 리스트(adjacent)에 서로가 포함(연결) 되어있는지 확인하고, 없으면 추가
            n1.adjacent.add(n2);
        }
        if(!n2.adjacent.contains((n1))){
            n2.adjacent.add(n1);
        }
    }    
    
    
}
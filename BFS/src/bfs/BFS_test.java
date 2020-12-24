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



public class BFS_test {

    static final int N = 7;
    static boolean[] visit = new boolean[N + 1];
    static LinkedList<Integer>[] list;
    
    static{
        list = new LinkedList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public BFS_test() {
        
    }
    
    
    public static void bfs(int start_node){
        Queue<Integer> q = new LinkedList<>();
        
        q.add(start_node);
        visit[start_node] = true;
        
        while(!q.isEmpty()){
            int now = q.poll();
            System.out.print(now + " ");
            
            for (int i = 0; i < list[now].size(); i++) {
                int x = list[now].get(i);
                if(!visit[x]){
                    q.add(x);
                    visit[x] = true;
                }
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // 1, 2 연결
        list[1].add(2);
        list[2].add(1);
        
        // 1, 3 연결
        list[1].add(3);
        list[3].add(1);
        
        // 2, 3 연결
        list[2].add(3);
        list[3].add(2);
        
        // 2, 4 연결
        list[2].add(4);
        list[4].add(2);
        
        // 2, 5 연결
        list[2].add(5);
        list[5].add(2);
        
        // 3, 6 연결
        list[3].add(6);
        list[6].add(3);
        
        // 3, 7 연결
        list[3].add(7);
        list[7].add(3);
        
        // 4, 5 연결
        list[4].add(5);
        list[5].add(4);
        
        // 6, 7 연결
        list[6].add(7);
        list[7].add(6);
        
        bfs(1);
    }
    
}

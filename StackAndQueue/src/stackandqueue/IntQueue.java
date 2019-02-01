/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Dennis
 */
public class IntQueue {
    
    private Queue<Integer> queue;
    
    public IntQueue(){
        queue = new LinkedList<>();
    }
    public static void main(String[] args) {
        IntQueue q = new IntQueue();
        
        q.add(2);
        q.add(3);
        q.offer(4);
        q.print();
        System.out.println("");
        
        System.out.println(q.getFirstAndRemove());
        System.out.println("");
        
        q.print();
        System.out.println("");
        
        System.out.println(q.getFirst());
        System.out.println("");
        
        q.print();
        
        
        
      
    }
    
    public void add(int num)throws IllegalStateException{
        queue.add(num);
    }
    public int remove(){
        return queue.remove();
    }
    public void print(){
        for (Integer integer : queue) {
            System.out.println(integer);
        }
    }
    public void offer(int num){
        queue.offer(num);
    }
    public int getFirst(){
       return queue.element();
        
    }
    public int getFirstAndRemove(){
        return queue.poll();
    }

}

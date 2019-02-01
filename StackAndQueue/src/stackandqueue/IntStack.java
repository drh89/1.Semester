/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackandqueue;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author Dennis
 */
public class IntStack {
    
    private Stack<Integer> ints;
    
    public IntStack(){
        ints = new Stack();
    }
    public static void main(String[] args) {
        IntStack i = new IntStack();
        
        i.push(1);
        i.push(2);
        
        System.out.println(i.pop());
        System.out.println(i.pop());
        
        

    }
    
    
    public void push(int num)throws IllegalStateException{
        ints.push(num);
    }
    public int pop() throws EmptyStackException{
       return ints.pop();
    }
    public int search(int num){
         return ints.search(num);
    }
    public int getFirst(){
       return ints.peek();
    }
    public boolean isEmpty(){
        return ints.empty();
    }
    
   
}

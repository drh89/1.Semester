/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsort;

import java.util.Random;

/**
 *
 * @author Dennis
 */
public class HeapSort {

    private Random rand;
    private int[] array;

    public HeapSort(int size) {
        rand = new Random();
        array = createArray(size);
        heapify(array);
    }
    public static void main(String[] args) {
        HeapSort sort = new HeapSort(10);
        for (int i = 0; i < sort.array.length; i++) {
            System.out.println(sort.array[i]);
        }
        
        
    }

    public int[] createArray(int size) {
        array = new int[size];
        for (int i = 0; i < size - 1; i++) {
            array[i] = rand.nextInt(1000);

        }
        return array;
    }
    public void heap(int n){
        int least = getLeft(n);
        if (least == -1) {return;}
        int right = getRight(n);
        if(right != -1 && array[getRight(n)] > array[least]){
            least = right;
        }
        if(array[n] <= array[least]){
            return;
        }
        int temp = array[n];
        array[n] = array[least];
        array[least] = temp;
        heap(least);
    }

    public void heapify(int[] array) {
        if (array.length == 0) {
            return;
        }
        int index = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            int last = array[i];
            int parent = getParent(array[i]);
           if(last < parent){
               int temp = last;
               last = parent;
               parent = temp;
               
               
           }

        }
        
    }

    public int getLeft(int index) {
        int left = 2 * index + 1;
        if(left == 0){
            return -1;
        }
        return left;
    }

    public int getRight(int index) {
        int right = 2 * index + 2;
        if(right == 0){
            return -1;
        }
        return right;
    }

    public int getParent(int index) {
        int parent = (index - 1) / 2;
        return parent;
    }
  

}

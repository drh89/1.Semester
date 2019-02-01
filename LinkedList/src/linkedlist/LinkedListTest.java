/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Dennis
 */
public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        
     
        for (int i = 1; i <= 20; i++) {
            list.addAtHead(i);

        }

        list.printList();
        System.out.println("");
        System.out.println(list.getSize());
        
        System.out.println("");

        for (int i = 0; i < 20; i++) {
            System.out.println(list.takeFirst());
        }
        System.out.println("");
        
        System.out.println(list.getSize());
        System.out.println("");
        
        for (int i = 1; i <= 20; i++) {
            list.addAtTail(i);

        }
        list.printList();
        
        System.out.println("");
        
        System.out.println(list.getSize());
        
        System.out.println("");
        
        for (int i = 0; i < 20; i++) {
            System.out.println(list.takeLast());
        }
        System.out.println("");
        
        System.out.println(list.getSize());
        
        

//        System.out.println("");
//        
//        list.addAtTail(10);
//        list.addAtTail(11);
//        list.addAtTail(12);
//        list.addAtTail(13);
//        list.addAtTail(14);
//        list.addAtTail(15);
//        list.printList();
//        System.out.println("");
//         for (int i = 0; i <= 5; i++) {
//            System.out.println(list.takeFirst());
//            
//        }
//        System.out.println("");
//        System.out.println(list.getSize());
    }

}

/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsorter;

import java.util.NavigableSet;


import java.util.TreeSet;

/**
 *
 * @author Dennis
 */

//Treeset
//Sorts: Capital letters first, then alfabethical, then length(shortest length first)

public class StringSorter {

   private NavigableSet strings;
   
   public StringSorter(){
       strings = new TreeSet();
   }
    public static void main(String[] args) {
      StringSorter sorter = new StringSorter();
      
      sorter.add("Hej");
      sorter.add("Hej");
      sorter.add("Med");
      sorter.add("Dig");
      sorter.add("hej");
      sorter.add("med");
      sorter.add("dig");
      sorter.add("hEj");
      sorter.add("mEd");
      sorter.add("dIg");
      sorter.print();
    }
    
   
   public void add(String str){
       strings.add(str);
   }
   public void print(){
       for (Object string : strings) {
           System.out.println(string);
           
       }
   }
}

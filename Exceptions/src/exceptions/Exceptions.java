/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Dennis
 */
public class Exceptions {

    public static void main(String[] args) {
        Exceptions ex = new Exceptions();

        System.out.println(ex.division(0, 8));

    }

    public int division(int a, int b) throws IllegalArgumentException {
        if(a == 0){
            throw new IllegalArgumentException();
        }
        
        if (b % a != 0) {
            throw new IllegalArgumentException();
        }
        return b / a;

    }

}

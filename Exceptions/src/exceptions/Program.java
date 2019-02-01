/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Dennis
 */
public class Program {
    private ArrayList<User> usersOnline = new ArrayList();
    
    
    public static void main(String[] args) {
        Program prog = new Program();
        
        User user1 = new User ("Dennis", "1234");
        User user2 = new User ("Brian", "1234");
        User user3 = new User ("Jens", "1234");
        
        prog.logIn(user1);
        prog.logIn(user2);
        
        System.out.println(prog.usersOnline.toString());
        try{
            prog.howManyOnline(user3);
            System.out.println(prog.randomNum(user3));
        }catch(NotLoggedInException e){
            System.out.println("User is not logged in");
        }
        prog.logOut(user1);
        prog.logOut(user2);
        System.out.println(prog.usersOnline.toString());
    }
    
    
    
    
    public void logIn(User u){
        if(usersOnline.size() < 2){
        usersOnline.add(u);
        }
        else{
            System.out.println("Two users already signed in");
        }
    }
    public void logOut(User u){
        usersOnline.remove(u);
        
    }
    public int howManyOnline(User u) throws NotLoggedInException{
        if(!usersOnline.contains(u)){
            throw new NotLoggedInException();
        }
        return usersOnline.size();
    }
    public int randomNum(User u) throws NotLoggedInException{
        Random rand = new Random(System.currentTimeMillis());
        if(!usersOnline.contains(u)){
            throw new NotLoggedInException();
        }
        return rand.nextInt(101);
        
    }
    
    
}

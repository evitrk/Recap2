/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recap;

import java.util.ArrayList;
import java.util.List;


public class Recap {

    
    public static void main(String[] args) {
       
        
        List<Dog> listOfDogs = new ArrayList();//!oxi List<Objects> 
        
       
        Dog d1 = new Dog("Sara",5);
        listOfDogs.add(d1);
        Dog d2 = new Dog("Vilma",6);
        listOfDogs.add(d2);
       
        
      //  d1.setName("Bet");
        
        //System.out.println(d1.getName());
        
        PersonD p1 = new PersonD("Nikos",45);
        p1.setSkyli(d1);
        PersonD p2 = new PersonD("Mary",21);
        
        List<PersonD> listOfPerson =  new ArrayList();
        listOfPerson.add(p1);
        listOfPerson.add(p2);
        
        for(PersonD p: listOfPerson){
            System.out.println(p.getName()+ " "+p.getAge());
            System.out.println(p);//apo thn toString
            System.out.println(p.getSkyli());
          }
        
        //kathe anthrwpo na ektuponoume to onoma toy skyliou
         for(PersonD p: listOfPerson){
             if(p.getSkyli()!=null)
               System.out.println("O "+p.getName()+" exei ton skulo "+p.getSkyli().getName());
             else
               System.out.println("O "+p.getName()+" den exei skulo "); 
         }
         
         
         Team t1 = new Team("football");
         t1.setPlayers(listOfPerson);
         
         PersonD p3 = new PersonD("Andy",19);
         t1.addPlayer(p3);//!!!
         
         Dog d3 = new Dog("Russel",1);
         
         p3.setSkyli(d3);
         
         List<PersonD> listaPerson2 = t1.getPlayers();
         System.out.println("\nPrinting from team");
         
         for(PersonD human:listaPerson2){
         
             if(human.getSkyli()!=null){
                 System.out.println("Person "+human.getName()+ " has dog "+human.getSkyli().getName());
             }else
                System.out.println("There is no dog");
             
             }
         
         }
         
    }
    

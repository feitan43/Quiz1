/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class main{
     public static void main(String[] args) {
        Person<String> person1 = new Person<>("Person1",null,"firstname","lastname","address");
        Person<String> person2 = new Person<>("Person2",null,"firstname","lastname","address");
        Person<String> person3 = new Person<>("Person3",null,"firstname","lastname","address");
        Person<String> person4 = new Person<>("Person4",null,"firstname","lastname","address");
        Person<String> person5 = new Person<>("Person5",null,"firstname","lastname","address");
        
        PersonList<String> pList = new PersonList<>();
            
        System.out.println("\nAddFirst()");
        pList.addFirst(person1);
        pList.SinglyLinkedList();
        
        System.out.println("\nAddFirst()");
        pList.addFirst(person2);
        pList.SinglyLinkedList();
        
        System.out.println("\nAddFirst()");
        pList.addFirst(person3);
        pList.SinglyLinkedList();
        
        System.out.println("\nAddFirst)");
        pList.addFirst(person4);
        pList.SinglyLinkedList();
        
        System.out.println("\nADD LAST");
        pList.addLast(person5);
        pList.SinglyLinkedList();
        
        
        System.out.println("\nAfter removeFirst()");
        pList.removeFirst();
        pList.SinglyLinkedList();
        
        System.out.println("\nAfter removeFirst()");
        pList.removeFirst();
        pList.SinglyLinkedList();
        
        System.out.println("\nAfter removeFirst()");
        pList.removeFirst();
        pList.SinglyLinkedList();
        
        System.out.println("\nAfter removeFirst()");
        pList.removeFirst();
        pList.SinglyLinkedList();
        
     }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author Maiguelm
 */
public class Person {
    
    private long id;
    private String name;
    private int age;
    
    public Person (long id, String name, int age){
        this.id = id;
        this.name= name;
        this.age= age;
    }
    
    @Override
    public String toString(){
        return "Person{" + "id=" +id+",name=" + name + '}';
        
    }
    
}

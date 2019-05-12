package mum.cs472;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anish
 */
public class Age {
    
    private Integer age = 0;
    
    public int getAge(){
    return age;
    }
    
    public void setAge(int age){
    this.age= age;
    }
    
    @Override
    public String toString(){
    return ""+age;
    }
    
}

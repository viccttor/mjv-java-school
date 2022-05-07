package com.mjvSchool.object;


public class ClasseTeste extends Object{
    public String s1;
    
    public ClasseTeste(){
        System.out.println("Objeto da classeTeste criado!");
        this.s1= "oi";
        
    }
    
    @Override
    protected Object clone(){
        return this;
    }
}

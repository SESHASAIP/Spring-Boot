package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(value="prototype")
public class Trainer {
	 private int id;
	    private String name;
	    
	    public Trainer()
	    {
	        id = -1;
	        name = "dummy";
	        System.out.println("Trainer object is created");
	    }
	    public int getId() {
	        return id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    @Override
	    public String toString() {
	        return "Trainer{" + "id=" + id + ", name=" + name + '}';
	    }
	    

}

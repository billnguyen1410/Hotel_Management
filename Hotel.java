package javaapplication9;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Long Nguyen
 */
public abstract class Hotel 
{    
    private int id;
    private String ssn; 
    private String firstName;
    private String lastName;
    
    public Hotel(int id, String firstName, String lastName, String socialSecurityNumber){
	id = this.id;
        firstName = this.firstName;
        lastName = this.lastName;
	socialSecurityNumber = this.ssn;        
    }
    
    public void setfirstName(String first){
        firstName = first; 
    }
    
     public void setlastName(String last){
        lastName = last; 
    }
     
      public void setId(int id){
		id = id; 
    }
      
     public void setSocialSecurityNumber(String socialSecurityNumber){
        socialSecurityNumber = ssn; 
    }
      
    public String getfirstName(){
        return firstName;
    }  
    
    public String getlastName(){
        return lastName;
    }  
    
    public int getId(){
        return id;
    }  
    
    public String getSocialSecurityNumber(){
        return ssn;
    }  
    
}

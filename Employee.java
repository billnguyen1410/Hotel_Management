/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author Long Nguyen
 */
public class Employee extends Hotel{

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    //three-argument constructor
    public Employee (int id, String fname, String lname, String ssn) {
        super (id, fname, lname, ssn);
        firstName = fname;
        lastName = lname;
        socialSecurityNumber = ssn;
    } // end three-argument constructor
    
    // set first name 
    public void setfirstName (String fname) {
        firstName = fname;
    } 
    // return first name
    public String getfirstName (){
        return firstName;
    }
    
    // set last name
    public void setlastName (String lname){
        lastName = lname;
    }
    // return last name
    public String getlastName (){
        return lastName;
    }
    
    // set social security number
    public void setsocialSecurityNumber(String ssn){
        socialSecurityNumber = ssn;
    }
    //return ssn
    public String getsocialSecurityNumber(){
        return socialSecurityNumber;
    }
    
    //return Employee of object
    public String toString() {
        return String.format( "%s %s\nsocial security number: %s",
        getfirstName(), getlastName(), getsocialSecurityNumber() );
    }
}

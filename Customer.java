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
public class Customer
{
	private String firstName, lastName;
	private int id;
	
	public Customer(String firstName, String lastName, int id)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getId()                                                                                                                                 
	{
		return id;
	}
	
	public void setFirstName(String fName)
	{
		firstName = fName;
	}

	public void setLastName(String lName)
	{
		lastName = lName;
	}
	
	public void setId(int num)
	{
		id = num;
	}
	public String toString() 
	{
        return String.format( "%s %s\nsocial security number: %s",getFirstName(), getLastName(), getId());
	}
}

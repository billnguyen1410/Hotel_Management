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
public class EmployeeTest{

	public static void main(String[] args)
	{
		Employee employees[] = new Employee[ 4 ]; 

      employees[ 0 ] = new HourlyEmployee( 
         "Jenn", "Hunter", "111-11-1111", 12, 10);
      employees[ 1 ] = new HourlyEmployee( 
         "Kathleen", "James", "222-22-2222", 17, 35);
      employees[ 2 ] = new SalaryEmployee( 
         "Quasim", "Copley", "333-33-3333", 100000); 
      employees[ 3 ] = new SalaryEmployee( 
         "Yelle", "Smoths", "444-44-4444", 20000);

      System.out.println( "Employees processed polymorphically:\n" );
      
      for ( Employee currentEmployee : employees) 
      {
         System.out.println( currentEmployee ); 
         System.out.printf( 
            "Earnings $%,.2f\n\n", currentEmployee.earnings() );
	  }
	}
}

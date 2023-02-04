package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index
		
		int age = 30;														//Variable
		int[] ageDeadpool = new int[]{25, 	21, 	35, 	30, 	40};	//Array
		
		//Array index 				 [0]	[1] 	[2] 	[3] 	[4]
		
		System.out.println("Student Age : " + ageDeadpool[1]);
		System.out.println("Total Studen : " + ageDeadpool.length);
		
		
		String[] nameDeadpool = new String[]{"Masud", "Tahin", "Zaman", "Razzaq", "Tanzu", "Shamme"};
		
		System.out.println("Student Name : " + nameDeadpool[1]);
		System.out.println("Total Student Name: " + nameDeadpool.length);
		
		
		String[] namecity= new String[]{"Newyork", "New jersey", "Maryland", "Connecticut"};
		
		System.out.println("City Name  : " + namecity[3]);
		System.out.println("Total City : " + namecity.length);
	
		
		
	//Multi-Dimentional Array
		int[][] ageUpskill2D = {{25, 21, 35, 30, 40},        //[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
		                        {21, 25, 22, 25}};            //[1][0]  [1][0] [2][0] [3][0] [4][0]
		                        
		                        
		                        
		  System.out.println("Student age 2D : " + ageUpskill2D[0][3]);
		
		  
		//Multi-Dimentional Array
			String[][] nameUpskill2D = {{"x", "y", "z"},        //[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
			                        {"a", "b", "c"}};            //[1][0]  [1][0] [2][0] [3][0] [4][0]
			                        
			                        
			                        
			  System.out.println("Student age 2D : " + ageUpskill2D[0][2]);	  
		  
		  
		//HashMap store multipul data using key-value pair, Implementation of map interface
			  
			  HashMap<String, Integer> Student = new HashMap<String, Integer>();
			  
			  Student.put("Tanzu", 22);
			  Student.put("Tahin", 21);
			  Student.put("Masud", 24);
			  Student.put("Shishir", 24);
			  
			  System.out.println("HashMap Student Age : "+ Student.get("Shishir"));
			  
			  
			  
			  
			  
  HashMap<String, String> Country = new HashMap<String, String>();
			  
			  Country.put("Bangladesh", "Dhaka");
			  Country.put("India", "Delhi");
			  Country.put("United States", "Washington DC");
			  Country.put("X", "Y");
			  
			  System.out.println("HashMap Student Age : "+ Country.get("Bangladesh")); 
				  
			  
			  
		HashSet<String> car = new HashSet<String>();
			  
			  
			  car.add("BMW");
			  car.add("Toyota");
			  car.add("Audi");
			  car.add("Ford");
			  
			  
			  System.out.println("Car :" + car);
			  
			  
			  
HashSet<String> capital = new HashSet<String>();
			  
			  
              capital.add("X");
              capital.add("Y");
              capital.add("Z");
              capital.add("A");
			  
			  
			  System.out.println("Capital :" + capital);
		
			  
			  
			  
			  //HashTable store multiple data using key-value pair, no duplicate, also is synchronized (only one thread can be modified)
			  
			  
			  
			  Hashtable<String, String> Region = new Hashtable<String, String>();
			  
			  Region.put("BD", "Asia");
			  Region.put("USA", "America");
			  
			  System.out.println("Region : "+ Region.get("BD"));
		  
			  
			  
	}
	

}

       // 1.array - maltipule value

      //  2.hashmap - keyvalue pair
      //  3.hashset - no dublicat
         //4. hashtable -no sentronice



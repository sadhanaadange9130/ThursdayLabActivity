package com.question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainProduct {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();  
		
         a1.add(new Product(1,"sadhana",45500));
         a1.add(new Product(2, "madhu", 20000));
         a1.add(new Product(3,"priti", 2500));
         a1.add(new Product(4, "shivani", 3000));
         
      
         System.out.println("Sorting by Name");  
         
         Collections.sort(a1,new NameProduct());  
         Iterator itr=a1.iterator();  
         while(itr.hasNext()){  
         Product st=(Product)itr.next();  
         System.out.println(st.id+" "+st.name+" "+st.price);  
         }  
         System.out.println("_____________________________________");
         System.out.println("Sorting by price");  
         
         Collections.sort(a1);  
         Iterator itr2=a1.iterator();  
         while(itr2.hasNext()){  
         Product st=(Product)itr2.next();  
         System.out.println(st.id+" "+st.name+" "+st.price);  
         }  
	}

}

	
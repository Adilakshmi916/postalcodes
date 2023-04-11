package com.sampleproject;

import java.util.Iterator;
import java.util.List;

public static void main(String[] args) {
		  ArrayList list=new ArrayList();//Creating arraylist  
		  list.add("Mango");//Adding object in arraylist    
		  list.add("Apple");    
		  list.add("Banana");    
		  list.add("Grapes");    
		  //Traversing list through Iterator  
		  Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }
}



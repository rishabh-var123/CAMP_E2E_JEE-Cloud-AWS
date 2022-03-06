package capgemini_Assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		List<Integer> list1=Arrays.asList(5,41,77,74,22,44);
		List<Integer> list2=Arrays.asList(1,12);
		List<Integer> list3=Arrays.asList(4,37,34,36,52);
		List<Integer> list4=Arrays.asList(0);
		List<Integer> list5=Arrays.asList(3,20,22,33);
		ArrayList<Object> result=new ArrayList<>();
		
		
		
		int task=in.nextInt();
		for(int i=0;i<task;i++)
		{
			int list=in.nextInt();
			int pos=in.nextInt();
			switch(list)  {    
			case 1:    
				try {
			    	 result.add(list1.get(pos));}
			     catch(Exception e) {
			    	 result.add("ERROR!");
			     }
			    	 
			 break;   
			case 2:    
				try {
			    	 result.add(list2.get(pos));}
			     catch(Exception e) {
			    	 result.add("ERROR!");
			     }
			 break;
			case 3: 
				try {
			    	 result.add(list3.get(pos));}
			     catch(Exception e) {
			    	 result.add("ERROR!");
			     }
			    
				 break;
			case 4:    
				try {
			    	 result.add(list4.get(pos));}
			     catch(Exception e) {
			    	 result.add("ERROR!");
			     }
				 break;
			case 5:    
				try {
			    	 result.add(list5.get(pos));}
			     catch(Exception e) {
			    	 result.add("ERROR!");
			     }
				 break;
				 
			}
		}
		for(Object ele:result) {
		System.out.println(ele);
		}
	}
}

		
		
       
      
		

	



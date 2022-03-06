package capgemini_Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> contact=new HashMap<>();
		
		contact.put("uncle sam", 999912222);
		contact.put("tom", 1111122222);
		contact.put("harry", 333312222);
		while(true)
		{
			String search=sc.nextLine();
			if(contact.containsKey(search)==true)
			{
				for(Map.Entry<String, Integer> e:contact.entrySet())
				{
					if(e.getKey().contentEquals(search))
					{
						System.out.println(e.getValue());
					}
				}
					
			}
			else
				System.out.println("Not found");
		}

	}

}

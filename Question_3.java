package capgemini_Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> contact=new HashMap<>();
		Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        scn.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=scn.nextLine();
            int phone=scn.nextInt();
            scn.nextLine();
            contact.put(name,phone);
        }
		while(true)
		{
			String search=scn.nextLine();
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

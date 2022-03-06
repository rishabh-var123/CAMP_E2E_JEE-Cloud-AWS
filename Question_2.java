package capgemini_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(); 
		int ele;
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			ele=in.nextInt();
			list.add(ele);
		}
		int choose=in.nextInt();
		for(int c=0;c<choose;c++)
		{
			String task=in.next();
			if(task.equals("Insert")) {
			
				int index=in.nextInt();
				int value=in.nextInt();
				list.add(index,value);
			}
			else {
				int pos=in.nextInt();
				list.remove(pos);
				
			}
			
		}	
		System.out.println(list);
			
		}
		
		

	}




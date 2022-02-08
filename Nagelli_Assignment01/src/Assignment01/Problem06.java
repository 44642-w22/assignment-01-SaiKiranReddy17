package Assignment01;
import java.util.*;
public class Problem06 {

public static void main(String args[]) 
	
	{
		Stack<Integer> a = new Stack<Integer>();
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter no of integers");
		int size = SC.nextInt();
	
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the element at index "+i);
			a.add(i, SC.nextInt());
			
		}
		System.out.println("Output(A): " +prob6(a));
		
		
	}
	
	
	public static ArrayList<Integer> prob6(Stack<Integer> a)
	{
		ArrayList<Integer> b = new ArrayList<Integer>();
		int size= a.size();
		 
		 		
	for (int i=a.size()-1;i>=a.size()/2;i--) {
			
			 b.add(a.get(i));
		} 
		for (int i=0;i<a.size()/2;i++) {
		
			b.add(a.get(i));			
		
		}
		 		
		
		return b;
	}
	

}


package Assignment01;
import java.util.*;
public class Problem02 {

public static void main(String args[]) {
		
		Scanner SC= new Scanner(System.in);
		
		LinkedList<Integer> p = new LinkedList<>();
		System.out.println("Enter k");
		int k= SC.nextInt();
		System.out.println("Enter no of input elements");
		int size=SC.nextInt();
		for (int i=0;i<size;i++) {
			System.out.println("Enter element");
			p.add(SC.nextInt());
		}	
		System.out.println("Output (L2) : " +prob2(p,k));
		
	} 
	
public static LinkedList<ArrayList> prob2(LinkedList<Integer> p, int k){
		
		LinkedList<ArrayList> outputList = new LinkedList<>();
		
		
		for (int i=0;i<p.size()-1;i++) {
			ArrayList<Integer> q = new ArrayList<>();
			
				
				
				int a = p.get(i);
				int b = p.get(i+1);
				if((a+b)==k)
				{
					q.add(a);
					q.add(b);
				}
				
			
			if(q.size()!=0) {
				outputList.add(q);
			}

		}
					
		return outputList;
		
	} 
}


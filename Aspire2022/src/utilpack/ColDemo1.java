package utilpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ColDemo1 {
	public static void main(String[] args) {
		int arr[]=new int[4];
		
		ArrayList<Integer> alist=new ArrayList<>();
		System.out.println("Size of alist after creating= " + alist.size());
		alist.add(2);
		alist.add(3);
		alist.add(4);
		System.out.println("Size of alist after adding items= " + alist.size());
		System.out.println("values are: ");
		for(int i=0; i<alist.size();i++) System.out.println(alist.get(i));
		
		
		alist.remove(2);
		
		ArrayList<String> aliststr=new ArrayList<>();
		System.out.println("Size of aliststr after creating= " + aliststr.size());
		aliststr.add("Imran");
		aliststr.add("Shahin");
		aliststr.add("Farhan");
		aliststr.add("Farhan");
		System.out.println("Size of aliststr after adding items= " + aliststr.size());
		for(String s:aliststr) System.out.println(s);
		
		System.out.println("\nUsing Iterator:");
		Iterator<String> iter=aliststr.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("\nUsing ListIterator:");
		ListIterator<String> liter=aliststr.listIterator();
		while(liter.hasNext())
			System.out.println(liter.next());
		
		System.out.println("\nUsing ListIterator previous: ");
		while(liter.hasPrevious()) System.out.println(liter.previous());

}
}

package collection2;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {

		HashSet<String>  set  = new HashSet<>();
		set.add("Java");
		set.add("Html");
		set.add("Oracle");
		set.add("Java");
		set.add("Spring");
		System.out.println( set.size() );   // 4
		System.out.println( set );
		
		// 인덱스로 접근 불가능
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String title = (String) iterator.next();
			System.out.print( title + " ");
		}
		
		/*
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.print( name + " ");			
		}
		*/
		System.out.println();
		

	}

}












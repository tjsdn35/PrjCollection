package collection1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		//  배열 -> ArrayList 
		/*
		 String   []   names     = new String [4]; // 배열 생성
		 names[0] = "홍길동";
		 names[1] = "이길동";
		 names[2] = "박길동";
		 names[3] = "최길동";
		 */
		// String   []   names     = new String [] {"홍길동","이길동", "박길동", "최길동" };
		String   []   names     = {"홍길동","이길동", "박길동", "최길동" };
		
		System.out.println("1.");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ", ");
		}
		// 홍길동, 이길동, 박길동, 최길동,
		// "김길동" 추가해줘 -> 배열로는 추가불가능
		// 배열은 실행할때 크기를 변경할 수 없다
		
		List<String>  nameList  = Arrays.asList( names  );		
		// 배열 names 를 List 로 조작한다
		// [홍길동, 이길동, 박길동, 최길동]
		System.out.println("2.");
		System.out.println(nameList);
		
		System.out.println("3.");
		// nameList.add(  "나길동" ); //  java.lang.UnsupportedOperationException
		  // Arrays.asList() 변환한 리스트는 add() 할 수 없다 <- size() 변경 불가능
		for (int i = 0; i < nameList.size(); i++) {
			String name = nameList.get(i);
			System.out.print( name + " " );
		}
		System.out.println();
		// 홍길동 이길동 박길동 최길동
		
		// sort
		// Collections.sort( nameList ); // ascending sort 
		
		Collections.sort( nameList );
		
		System.out.println(  nameList  );
		
		// 오름차순 정렬된 ArrayList 뒤집기
		Collections.reverse(nameList);
		System.out.println(  nameList  );
		
		// 람다식 : (a, b) -> a.compareTo(b)
		//  boolean  func(String a, String b) {
		//       return  a.compareTo(b);  
		//  }
		
		// callback 함수 : 함수의 인자가 함수일때 전달되는 함수를 콜백함수라고 한다
		
		// 오름차순 정렬
		Collections.sort( nameList, (a,b) -> a.compareTo(b) );
		System.out.println( nameList );
		
		// 네림차순 정렬
		Collections.sort( nameList, (a,b) -> b.compareTo(a) );
		System.out.println( nameList );

	}

}









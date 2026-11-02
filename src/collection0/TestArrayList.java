package collection0;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		
		// 자바 1.2 - 타입이 Object 라 불편함
		// size 0 인 배열(ArrayList) 를 준비
		// add(Object o) - 모든 인자 type 을 받을 수있다, 아무꺼나 type
		ArrayList al = new ArrayList();
		//자료를 추가
		al.add(1);			//0
		al.add(7);			//1
		al.add("ckckck");	//2
		al.add(104.5);		//3
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i)); // al[i]
		}
		
		int 	val1 = (int) al.get(0);
		//String val3 = (String) al.get(2);			// 비추
		String val3 = String.valueOf( al.get(2) );	// 추천
		System.out.println(val1);
		System.out.println(val3);	// 비추
		
		// java 1.5
		// 배열처럼 타입을 제한하는 기술필요 -> Generic
		// 배열은 타입이 일정하다
		//< Type > :Type - Reference Type 만 가능 class Type 만 가능
		// int X -> Integer ( Wrapper class )
		// ArrayList<int> al2 = new ArrayList<int>();	// error
		ArrayList<Integer> al2 = new ArrayList<Integer>();	// 정상 ( int 만 사용가능)
		al2.add( 100   );
		al2.add( 10000 );
		//al2.add( "태훈이" );	//
		
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
		// java 1.8 : 뒤부분의 Type 생략가능
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("장원영");
		nameList.add("안유진");
		nameList.add("카리나");
		nameList.add("윈터");
		
		System.out.println(nameList);
		
	}

}

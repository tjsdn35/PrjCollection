package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {

		int [] arr  =  new int[3];
		arr[0]      =  10;
		arr[1]      =  20;
		arr[2]      =  30;
		// arr[3]      =  40; // ArrayIndexOutOfBoundsException  // 0~2
		for (int i = 0; i < arr.length; i++) {
			System.out.print ( arr[i] +  " " );
		}
		System.out.println();
		
		//---------------------------------------
		//ArrayList<Integer>  numList =  new ArrayList<Integer>();
		List<Integer>  numList =  new ArrayList<Integer>();
		numList.add( 10 );  // 0
		numList.add( 20 );  // 1
		numList.add( 30 );
		numList.add( 40 );
		numList.add( 50 );  // 4
		
		for (int i = 0; i < numList.size(); i++) {
			System.out.print ( numList.get(i) + " ");
		}
		System.out.println();
		
		numList.add(100);
		numList.add(35);
		
		//10 2 30 40 50 100 35
		// for each
		// 첫번째 반복 num : 10
		// 두번째 반복 num : 20
		//.....
		// 마지막 반복 num : 35
		for (Integer num : numList) {
			System.out.print( num + " ");
		}
		System.out.println();
		
		// 정렬 : 순서대로 , sort
		// 오름차순 : ascending sort : 작 -> 큼
		Collections.sort( numList, (a, b) -> a-b );
		System.out.println( numList );
		
		// 내림차순 : descending sort : 큼 -> 작
		Collections.sort( numList, (a, b) -> b-a );
		System.out.println( numList );
		
		//(int a, int b) -> return b - a;
		// int comp(int a, int b) {
		// 		return a - b;
		// }
		 
		
	}

}
















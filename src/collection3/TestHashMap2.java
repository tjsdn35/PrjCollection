package collection3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "인사");
		map.put(20, "자재");
		map.put(30, "연구개발");
		map.put(40, "총무");
		map.put(50, "생산");
		
		System.out.println(  map );
		System.out.println(  map.get(30) );
		System.out.println(  map.size() );
		
		map.put(70, "기획");	// 추가 add
		map.put(10, "홍보");	// 수정 set 기존번호 있어
		System.out.println(  map );
		System.out.println(  map.get(10) );
		System.out.println(  map.size() );
		
		// 모두출력 1. 
		System.out.println("2.");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String  val = entry.getValue();
			System.out.println(key + ":" + val);			
		}
		
		// 모두출력 2.
		// 키목록 : Set keySet()
		System.out.println("2.");
		Set<Integer>  keySet =  map.keySet();
		for (Iterator iterator = keySet.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			System.out.println(key + ":" + map.get(key) );			
		}
		
	
		
	}

}







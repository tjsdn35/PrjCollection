package collection3;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		// 		key		value
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("num",  1);
		map.put("name", "송중기");
		map.put("kor", 90);
		map.put("eng", 95);
		map.put("mat", 92);
		map.put("height", 178.3);
		
		System.out.println( map );
		
		int     num     =  (int) map.get("num");
		System.out.println( num );
		// String  name    =   (String) map.get("name"); // 비추
		String  name    =  String.valueOf(  map.get("name") );  // 추천 Object -> String
		System.out.println( name );
		int     kor     =  (int) map.get("kor") ; 
		System.out.println( kor );
		int     eng     =  (int) map.get("eng");
		System.out.println( kor );
		int     mat     =  (int) map.get("mat");
		System.out.println( mat );
		double  height  = (double) map.get("height");
		System.out.println( height );
				
	}

}





 


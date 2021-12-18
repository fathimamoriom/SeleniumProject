package seleniumPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapPractice {

	public static void main(String[] args) {
		
		//Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		
		Map<String, Integer> list = new LinkedHashMap<String, Integer>();
		
		list.put("Moriom", 111);
		list.put("Mahee", 123);
		list.put("Oishi", 124);
		list.put("Tushi", 134);
		list.put("Fatimah", 145);
		list.put("Moriom", 154);
		list.put("Ayan", 130);
		list.put("Mahee", 166);
		list.put("Ayrin", 256);
		

        /* Syntax: for(datatype MapName : Collection){
       		Sysout(MapName);
       		}*/
         
     /*  for (Entry<String, Integer> eachMP : mp.entrySet()) {
       	  System.out.println(eachMP.getKey() +"   "+ eachMP.getValue());
			
		}*/
		
		for(Entry<String, Integer> eachList:list.entrySet()) {
			System.out.println(eachList.getKey()+"    "+eachList.getValue());
			
		}
		
		System.out.println(list.size());
		
		list.get("Fatimah");
		System.out.println(list.get("Fatimah"));
		
		list.remove("Tushi");
		System.out.println(list.size());
		
		for(Entry<String, Integer> eachList:list.entrySet()) {
			System.out.println(eachList.getKey()+"    "+eachList.getValue());
			
		
		
		}
		list.containsKey("Ayan");
		System.out.println(list.containsKey("Ayan"));
		
		list.containsValue(124);
		System.out.println(list.containsValue(124));
		
		list.clear();
		System.out.println(list.isEmpty());
		
		
		
		
		
		
	}

}

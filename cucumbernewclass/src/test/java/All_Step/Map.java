package All_Step;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		
		HashMap<String,Integer> p= new HashMap<String,Integer>();
		
		p.put("abul", 400);
		p.put("hasanath", 2);
		p.put("sarker", 3);
		p.put("tanjina", 100);
		p.put("tanjina", 500);
		
		Set<Entry<String,Integer>>a=p.entrySet();
		for(Entry<String,Integer>d:a)
		
	System.out.println(d);
		Set<String> v=p.keySet();
		System.out.println(v);
		
		Collection<Integer>x=p.values();
		System.out.println(x);
	}

}

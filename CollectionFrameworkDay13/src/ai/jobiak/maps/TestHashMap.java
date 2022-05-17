package ai.jobiak.maps;
import java.util.*;
import java.util.Map.Entry;
public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<>();
		map.put("apple", "iphone");
		map.put("samsung","Note1");
		map.put("nokia","windows");
		map.put("blackberry", "first smart phone");
		map.put("nokia","window");
		System.out.println(map.size());	
		System.out.println(map);
		//System.out.println(map.get("samsung"));
		Set keys=map.keySet();
		System.out.println(keys);
		Iterator iter=keys.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	      Collection values=map.values();
		for(Object obj:values) {
			System.out.println(obj);
		}
		Set<Entry<String, String>> entries=map.entrySet();
		Iterator iter2=entries.iterator();
		while(iter2.hasNext()) {
			Entry entry=(Entry)iter2.next();
			System.out.println(entry.getKey()+":: "+entry.getValue());
		}
 
	}

}

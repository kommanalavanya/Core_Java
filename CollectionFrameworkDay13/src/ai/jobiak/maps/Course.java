package ai.jobiak.maps;

import java.util.*;
import java.util.Map.Entry;

public class Course {

	public static void main(String[] args) {
		HashMap course=new HashMap();
		course.put("courseid", 1);
		course.put("title", "java");
		course.put("fees", 3000);
		Set<Entry<Object,Object>> entries=course.entrySet();
		Iterator iter2=entries.iterator();
		while(iter2.hasNext()) {
			Entry entry=(Entry)iter2.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
	}

	}

}

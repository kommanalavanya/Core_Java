package ai.jobiak.collectiontask;

import java.time.LocalDateTime;
import java.util.*;
import java.util.Map.Entry;


public class EmployeeHashMap {

	public static void main(String[] args) {
		Employee emp1=new Employee(101,"John Doe",LocalDateTime.now(),1);
		Employee emp2=new Employee(102,"John Doe",LocalDateTime.now(),1);
		Employee emp3=new Employee(103,"John Doe",LocalDateTime.now(),1);
		HashMap<String,Object> map=new HashMap<>();
		map.put("employee1",emp1);
		map.put("employee2", emp2);
		map.put("employee2", emp3);
		Set<Entry<String, Object>> entries=map.entrySet();
		Iterator<Entry<String, Object>> iter2=entries.iterator();
		while(iter2.hasNext()) {
			Entry entry=(Entry)iter2.next();
			System.out.println(entry.getKey()+":: "+entry.getValue());
		}
	}

}

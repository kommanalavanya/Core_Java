package ai.jobiak.maps;

import java.util.TreeMap;

public class TreeTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> players=new TreeMap<>();
		players.put(1,"Virat");
		players.put(2,"Bumrah");
		players.put(3, "raina");
		String name=(String)players.put(1, "rohith");
		System.out.println(name);
		System.out.println(players);

	}

}

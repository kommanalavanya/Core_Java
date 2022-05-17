package ai.jobiak.oops;

import java.util.HashMap;
import java.util.Random;

public class Balls
{
	
	public static void main(String[] args)
	{
		Random r=new Random();
		String colors[] = {"White","Red","Green","Blue"};
		String bag[] = new String[1000];
		for(int i=0;i<1000;i++)
		{
			bag[i] = colors[r.nextInt(4)];
		}
		HashMap<String,Integer> balls = new HashMap<String,Integer>();
		
		balls.put("White", 0);
		balls.put("Red", 0);
		balls.put("Green", 0);
		balls.put("Blue", 0);
		
	}
}







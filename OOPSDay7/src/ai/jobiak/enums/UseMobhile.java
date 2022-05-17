package ai.jobiak.enums;

public class UseMobhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile ref;
		ref=Mobile.valueOf("Google");
		System.out.println(ref);
		System.out.println(ref.showPrice());
		for(Mobile element:Mobile.values()) {
			//System.out.println("Brand="+mobile+",");
		}

	}

}

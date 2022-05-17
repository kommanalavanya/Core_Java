package ai.jobiak.aadharseva;

public class Address{
	String doorNo;
	String village;
	String city;
	String state;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String
			doorNo, String village, String city, String state) {
		
		this.doorNo = doorNo;
		this.village = village;
		this.city = city;
		this.state = state;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}

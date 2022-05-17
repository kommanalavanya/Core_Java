package ai.jobiak.inheritance;

public class ResidenceAddress extends Address {
	String houseName;
	String landMark;
	String timings;
	public ResidenceAddress() {
		// TODO Auto-generated constructor stub
	}
	public ResidenceAddress(String doorNo, String building, String city,String houseName, String landMark, String timings) {
		super(doorNo,building,city);
		this.houseName = houseName;
		this.landMark = landMark;
		this.timings = timings;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + getDoorNo() + ", building=" +getBuilding() + ", city=" + getCity()+ "]"+"ResidenceAddress [houseName=" + houseName + ", landMark=" + landMark + ", timings=" + timings + "]";
	}
	
	
	

}

package ai.jobiak.aadharseva;
public class AadharCardApplication {
	private int id;
	private String fullName;
	private int age;
	private String  gender;
	private String dateOfBirth;
	
	private String  pincode;
	private String phoneNo;
	private String email;
	private Address address;
	
	
	public AadharCardApplication() {
		// TODO Auto-generated constructor stub
	}


	public AadharCardApplication(int id,String fullName, int age, String gender, String dateOfBirth, String phoneNo,
			String pincode, String email, Address address) {
		this.id=id;
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.phoneNo = phoneNo;
		this.pincode = pincode;
		this.email = email;
		this.address = address;
	}


	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	

}

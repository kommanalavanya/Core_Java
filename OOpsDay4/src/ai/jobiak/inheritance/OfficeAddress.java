package ai.jobiak.inheritance;

public class OfficeAddress extends Address {
long phoneno;
String incharge;
String deliveryBlock;
public OfficeAddress() {
	// TODO Auto-generated constructor stub
}
public OfficeAddress(String doorNo, String building, String city,long phoneno, String incharge, String deliveryBlock) {
	super(doorNo,building,city);
	this.phoneno = phoneno;
	this.incharge = incharge;
	this.deliveryBlock = deliveryBlock;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}
public String getIncharge() {
	return incharge;
}
public void setIncharge(String incharge) {
	this.incharge = incharge;
}
public String getDeliveryBlock() {
	return deliveryBlock;
}
public void setDeliveryBlock(String deliveryBlock) {
	this.deliveryBlock = deliveryBlock;
}
@Override
public String toString() {
	return "Address [doorNo=" + getDoorNo() + ", building=" + getBuilding() + ", city=" + getCity() + "]"+"OfficeAddress [phoneno=" + phoneno + ", incharge=" + incharge + ", deliveryBlock=" + deliveryBlock + "]";
}


}

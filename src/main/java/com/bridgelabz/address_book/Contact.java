package com.bridgelabz.address_book;

public class Contact {

	private String firstName;
	   private String lastName;
	   private String city;
	   private String address;
	   private String state;
	   private int zip;
	   private long phone;
	   
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", address=" + address
				+ ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getCity()=" + getCity() + ", getAddress()=" + getAddress()
				+ ", getState()=" + getState() + ", getZip()=" + getZip() + ", getPhone()=" + getPhone()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	   
	   
}

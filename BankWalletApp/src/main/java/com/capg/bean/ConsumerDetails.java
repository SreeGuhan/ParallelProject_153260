package com.capg.bean;

public class ConsumerDetails {
	
	private String consumerName;
	private int age;
	private String gender;
	private String emailId;
	private String phoneNo;
	
	
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "ConsumerDetails [consumerName=" + consumerName + ", age=" + age + ", gender=" + gender + ", emailId="
				+ emailId + ", phoneNo=" + phoneNo + "]";
	}
	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

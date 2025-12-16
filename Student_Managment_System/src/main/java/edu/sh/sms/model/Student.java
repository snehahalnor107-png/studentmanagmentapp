package edu.sh.sms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int sutdentId;
 private String studentFullName;
 private String studentEmail;
 private String studentAge;
 private String studentCollageName;
 private String studentMobileNo;
 private String studentCoursesName;
 private String batchNumber;
 private String batchMode;
 private double feesPaid;
 
public int getSutdentId() {
	return sutdentId;
}
public void setSutdentId(int sutdentId) {
	this.sutdentId = sutdentId;
}
public String getStudentFullName() {
	return studentFullName;
}
public void setStudentFullName(String studentFullName) {
	this.studentFullName = studentFullName;
}
public String getStudentEmail() {
	return studentEmail;
}
public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}
public String getStudentAge() {
	return studentAge;
}
public void setStudentAge(String studentAge) {
	this.studentAge = studentAge;
}
public String getStudentCollageName() {
	return studentCollageName;
}
public void setStudentCollageName(String studentCollageName) {
	this.studentCollageName = studentCollageName;
}
public String getStudentMobileNo() {
	return studentMobileNo;
}
public void setStudentMobileNo(String studentMobileNo) {
	this.studentMobileNo = studentMobileNo;
}
public String getStudentCoursesName() {
	return studentCoursesName;
}
public void setStudentCoursesName(String studentCoursesName) {
	this.studentCoursesName = studentCoursesName;
}
public String getBatchNumber() {
	return batchNumber;
}
public void setBatchNumber(String batchNumber) {
	this.batchNumber = batchNumber;
}
public String getBatchMode() {
	return batchMode;
}
public void setBatchMode(String batchMode) {
	this.batchMode = batchMode;
}
public double getFeesPaid() {
	return feesPaid;
}
public void setFeesPaid(double feesPaid) {
	this.feesPaid = feesPaid;
} 
 
 
 

	
}

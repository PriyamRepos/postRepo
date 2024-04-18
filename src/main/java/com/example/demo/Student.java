package com.example.demo;
public class Student {

  private String sname;
  private String sage;
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSage() {
	return sage;
}
@Override
public String toString() {
	return "Student [sname=" + sname + ", sage=" + sage + "]";
}
public void setSage(String sage) {
	this.sage = sage;
}
	
	
}

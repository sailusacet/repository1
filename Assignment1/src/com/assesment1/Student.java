package com.assesment1;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public Student() {
		 super();
		 
	 } 
  public Student(int stid, String stname, int stage) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.stage = stage;
	}
 
int stid;
 String stname;
 int stage;

public void setStid(int stid) {
	this.stid = stid;
}
public int getStid() {
	return stid;
}

public void setStname(String stname) {
	this.stname = stname;
}
public String getStname() {
	return stname;
}

public void setStage(int stage) {
	this.stage = stage;
}
public int getStage() {
	return stage;
}
@Override
public String toString()
{
	return "{"+stid+","+stname+","+stage+"}";
}
 
 
}





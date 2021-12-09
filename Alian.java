package com.model;

public class Alian {
private int aid;
private String aname;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
@Override
public String toString() {
	return "Alian [aid=" + aid + ", aname=" + aname + "]";
}
public Alian(int aid, String aname) {
	super();
	this.aid = aid;
	this.aname = aname;
}
public Alian() {
	super();
	// TODO Auto-generated constructor stub
}

}

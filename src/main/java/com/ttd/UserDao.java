package com.ttd;

public class UserDao {
	public void init() {
		System.out.println("Db  connection is opened");
		
	}
	public void getData() {
		System.out.println(" getting data from database");
	}
	public void destroy() {
		System.out.println("db connection closed");
	}

}

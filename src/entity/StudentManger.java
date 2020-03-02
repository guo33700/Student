package entity;

import java.io.Serializable;

public class StudentManger implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String id;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public StudentManger(String name, int age, String id, String address) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.address = address;
	}
	public StudentManger() {
		super();
	}
	
	
}

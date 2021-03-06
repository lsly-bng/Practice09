package com.javaex.ex02;

public class Friend {

	//field
    private String name;
    private String hp;
    private String school;
	
    //constructor
	public Friend() {
		super();
	}
	
	public Friend(String name, String hp, String school) {
		super();
		this.name = name;
		this.hp = hp;
		this.school = school;
	}
	
	//method - gs
	public String getName() {
		return name;
	}
	public String getHp() {
		return hp;
	}
	public String getSchool() {
		return school;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	//method - general 
	@Override
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}

    

    

}

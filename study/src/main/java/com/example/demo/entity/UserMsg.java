package com.example.demo.entity;

public class UserMsg {

	private String id;
	/**
	 * 同事姓名
	 */
    private String workmateName;
    /**
     * 同事性别
     */
    private String sex;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 爱好
     */
    private String hobby;
	public String getWorkmateName() {
		return workmateName;
	}
	public void setWorkmateName(String workmateName) {
		this.workmateName = workmateName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}

package org.sg.domain;

public class Topic {
	private int id;
	private String name;
	private String description;
	private int course;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Topic Id: " + id + ", Nome: " + name + ", Description: " + description + ", Course: " + course;
	}
}

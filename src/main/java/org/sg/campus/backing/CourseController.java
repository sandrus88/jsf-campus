package org.sg.campus.backing;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.sg.campus.domain.Course;
import org.sg.campus.domain.Topic;
import org.sg.campus.util.JsfUtil;


@ManagedBean
@SessionScoped
public class CourseController {
	
	private TopicController topicController;
	private List<Course> courseList = new ArrayList<Course>();
	private Course selectedCourse;
	
	private List<Topic> allTopics = new ArrayList<Topic>();
	private List<Topic> selectedTopics;
			
	private int newId;
	private String newName;
	private String newDescription;
	
	public void courseTopics(Course course) {
		selectedCourse = course;
		selectedTopics = selectedCourse.getTopicList();
	}
	
	public void addCourse() {
		Course course = new Course();
		course.setId(newId);
		course.setName(newName);
		course.setDescription(newDescription);
		courseList.add(course);
		System.out.println("Course " + course + " added correctly");
	}
	
	public void deleteCourse(Course course) {
		courseList.remove(course);
		System.out.println("Course " + course + " deleted correctly");
	}
	
	public String updateSelectedCourse(Course course) {
		selectedCourse = course;
		return "/app/course/editCourse.xhtml?faces-redirect=true";
	}
	
	public String updateCourse() {
		System.out.println("Course " + selectedCourse + " updated correctly");
		return "/app/course/homeCourse.xhtml?faces-redirect=true";
	}
	
	public String viewCourse(Course course) {
		selectedCourse = course;
		System.out.println("Course " + course + " showed correctly");
		return "/app/course/viewCourse.xhtml?faces-redirect=true";
	}
	
	public void viewTopics(Course course) {
		selectedCourse = course;
		System.out.println("ViewTopic");
	}
	
	public int getNewId() {
		return newId;
	}
	public void setNewId(int newId) {
		this.newId = newId;
	}
	public String getNewName() {
		return newName;
	}
	public void setNewName(String newName) {
		this.newName = newName;
	}
	public String getNewDescription() {
		return newDescription;
	}
	public void setNewDescription(String newDescription) {
		this.newDescription = newDescription;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public Course getSelectedCourse() {
		return selectedCourse;
	}
	public List<Topic> getAllTopics() {
		topicController = JsfUtil.findBean("topicController");
		allTopics = topicController.getTopicList();
		return allTopics;
	}
	public List<Topic> getSelectedTopics() {
		return selectedTopics;
	}
}

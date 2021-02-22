package org.sg.backing;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.sg.domain.Course;
import org.sg.domain.Topic;


@ManagedBean
@SessionScoped
public class CourseController {
	private List<Course> courseList = new ArrayList<Course>();
	private Course selectedCourse;
	
	private List<Topic> allTopics = new ArrayList<Topic>();// questa e' la lista di tutti i checkbox, anche non selezionati
	private List<Topic> selectedTopics = selectedCourse.getTopicList();
			
	private int newId;
	private String newName;
	private String newDescription;
	
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
		return "/course/editCourse.xhtml?faces-redirect=true";
	}
	
	public String updateCourse() {
		selectedCourse.getId();
		selectedCourse.getName();
		selectedCourse.getDescription();
		System.out.println("Course " + selectedCourse + " updated correctly");
		return "/course/homeCourse.xhtml?faces-redirect=true";
	}
	
	public String viewCourse(Course course) {
		selectedCourse = course;
		System.out.println("Course " + course + " showed correctly");
		return "/course/viewCourse.xhtml?faces-redirect=true";
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
	
	
}

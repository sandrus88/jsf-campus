package org.sg.campus.backing;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.sg.campus.domain.Course;
import org.sg.campus.domain.Topic;
import org.sg.campus.util.JsfUtil;

@ManagedBean
@SessionScoped
public class CourseController {

	@ManagedProperty(value = "#{applicationBean}")
	private ApplicationBean applicationBean;
	private TopicController topicController;
	private List<Course> courseList = new ArrayList<Course>();
	private Course selectedCourse;

	private List<Topic> allTopics = new ArrayList<Topic>();
	private List<Topic> selectedTopics;

	private String newName;
	private String newDescription;
	private boolean newEnabled;

	public void addCourse() {
		Course course = new Course();
		course.setId(applicationBean.getNextInt());
		course.setName(newName);
		course.setDescription(newDescription);
		course.setEnabled(newEnabled);
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

	public boolean isNewEnabled() {
		return newEnabled;
	}

	public void setNewEnabled(boolean newEnabled) {
		this.newEnabled = newEnabled;
	}

	public void setApplicationBean(ApplicationBean applicationBean) {
		this.applicationBean = applicationBean;
	}

	public ApplicationBean getApplicationBean() {
		return applicationBean;
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

	private void cleanForm() {
		setNewName(null);
		setNewDescription(null);
	}

	public String reset() {
		cleanForm();
		return "/app/course/homeCourse.xhtml?faces-redirect=true";
	}

	public String backHome() {
		cleanForm();
		return "/index.xhtml?faces-redirect=true";
	}
}

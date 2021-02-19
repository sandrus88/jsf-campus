package org.sg.backing;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.sg.domain.Student;

@ManagedBean
@SessionScoped
public class StudentController {
	private List<Student> studentList = new ArrayList<Student>();
	private Student selectedStudent;
	
	private int newId;
	private String newName; 
	private String newSurname;
	private String newJobTitle;
	private String newPaymentType;
	private String newSex;

	public void addStudent() { 
		Student student = new Student();
		student.setId(newId);
		student.setName(newName);
		student.setSurname(newSurname);
		student.setJobTitle(newJobTitle);
		student.setPaymentType(newPaymentType);
		student.setSex(newSex);
		studentList.add(student);
//		return "/listStudent.xhtml?faces-redirect=true";
	}
	
	public String deleteStudent(Student student) {
		studentList.remove(student);
	    return null;
	}
	
	public void setNewId(int newId) {
		this.newId = newId;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public void setNewSurname(String newSurname) {
		this.newSurname = newSurname;
	}

	public void setNewJobTitle(String newJobTitle) {
		this.newJobTitle = newJobTitle;
	}

	public void setNewPaymentType(String newPaymentType) {
		this.newPaymentType = newPaymentType;
	}

	public void setNewSex(String newSex) {
		this.newSex = newSex;
	} 
	
	public int getNewId() {
		return newId;
	}

	public String getNewName() {
		return newName;
	}

	public String getNewSurname() {
		return newSurname;
	}

	public String getNewJobTitle() {
		return newJobTitle;
	}

	public String getNewPaymentType() {
		return newPaymentType;
	}

	public String getNewSex() {
		return newSex;
	}

	public List<Student> getStudentList() {
		return studentList;
	}	
	
	public Student getSelectedStudent() {
	    return selectedStudent;
	}

	public void setSelectedStudent(Student student) {
		selectedStudent = student;
	}
}

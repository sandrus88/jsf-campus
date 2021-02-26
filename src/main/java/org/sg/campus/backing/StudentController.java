package org.sg.campus.backing;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.sg.campus.beans.ApplicationBean;
import org.sg.campus.domain.PaymentType;
import org.sg.campus.domain.Student;

@ManagedBean
@SessionScoped
public class StudentController {
	
	@ManagedProperty(value="#{applicationBean}")
	private ApplicationBean applicationBean;
	private List<Student> studentList = new ArrayList<Student>();
	private Student selectedStudent;

	private String newName;
	private String newSurname;
	private String newEmail;
	private String newJobTitle;
	private PaymentType newPaymentType;
	private String newSex;

	public PaymentType[] getEnumValues() {
		return PaymentType.values();
	}

	public void addStudent() {
		Student student = new Student();
		student.setId(applicationBean.getNextInt());
		student.setName(newName);
		student.setSurname(newSurname);
		student.setEmail(newEmail);
		student.setJobTitle(newJobTitle);
		student.setPaymentType(newPaymentType);
		student.setSex(newSex);
		studentList.add(student);
		System.out.println("Student " + student + " added correctly");
		cleanForm();
	}

	public String updateSelectedStudent(Student student) {
		selectedStudent = student;
		return "/app/student/editStudent.xhtml?faces-redirect=true";
	}

	public String updateStudent() {
		cleanForm();
		System.out.println("Student " + selectedStudent + " updated correctly");
		return "/app/student/homeStudent.xhtml?faces-redirect=true";
	}

	public String viewStudent(Student student) {
		selectedStudent = student;
		System.out.println("Student " + selectedStudent + " showed correctly");
		return "/app/student/viewStudent.xhtml?faces-redirect=true";
	}

	public void deleteStudent(Student student) {
		studentList.remove(student);
		System.out.println("Student " + selectedStudent + " deleted correctly");
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

	public void setNewPaymentType(PaymentType newPaymentType) {
		this.newPaymentType = newPaymentType;
	}

	public void setNewSex(String newSex) {
		this.newSex = newSex;
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

	public PaymentType getNewPaymentType() {
		return newPaymentType;
	}

	public String getNewSex() {
		return newSex;
	}

	public String getNewEmail() {
		return newEmail;
	}

	public void setNewEmail(String newEmail) {
		this.newEmail = newEmail;
	}
	
	public ApplicationBean getApplicationBean() {
		return applicationBean;
	}

	public void setApplicationBean(ApplicationBean applicationBean) {
		this.applicationBean = applicationBean;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public Student getSelectedStudent() {
		return selectedStudent;
	}
	
	private void cleanForm() {
		setNewName(null);
		setNewSurname(null);
		setNewEmail(null);
		setNewJobTitle(null);
		setNewPaymentType(null);
		setNewSex(null);
	}
	
	public String reset() {
		cleanForm();
		return "/app/student/homeStudent.xhtml?faces-redirect=true";
	}
	
	public String backHome() {
		cleanForm();
		return "/index.xhtml?faces-redirect=true";
	}
}

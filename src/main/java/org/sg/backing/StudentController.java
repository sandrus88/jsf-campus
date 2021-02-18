package org.sg.backing;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.sg.domain.Student;

@ManagedBean
@RequestScoped
public class StudentController {
	List<Student> studentList = new ArrayList<Student>();
	
	private int newId;
	private String newName; 
	private String newSurname;
	private String newJobTitle;
	private String newPaymentType;
	private String newSex;
	
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
	
	public void addStudent() { 
		Student student = new Student();
		student.setId(newId);
		student.setName(newName);
		student.setSurname(newSurname);
		student.setJobTitle(newJobTitle);
		student.setPaymentType(newPaymentType);
		student.setSex(newSex);
		studentList.add(student);
		// quando vieene cchiamato questo metodo crea uno studente con i valori id, name etc
		// il nuovo studente aggiungilo alla lista
	}
}

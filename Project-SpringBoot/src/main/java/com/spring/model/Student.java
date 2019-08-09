package com.spring.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String gender;
	private String birthdayDate;
	private String docType;
	private int docNumer;
	
	

	public Student(String id, String firstName, String lastName, String gender, String birthdayDate, String docType,
			int docNumer) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthdayDate = birthdayDate;
		this.docType = docType;
		this.docNumer = docNumer;
	}

	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getBirthdayDate() {
		return birthdayDate;
	}



	public void setBirthdayDate(String birthdayDate) {
		this.birthdayDate = birthdayDate;
	}



	public String getDocType() {
		return docType;
	}



	public void setDocType(String docType) {
		this.docType = docType;
	}



	public int getDocNumer() {
		return docNumer;
	}



	public void setDocNumer(int docNumer) {
		this.docNumer = docNumer;
	}



	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", Nombre=" + firstName + ", Apellido=" + lastName + ", Género=" + gender
				+ ", Fecha de Nacimiento=" + birthdayDate + ", Tipo Documento=" + docType + ", Num Documento=" + docNumer + "]";
	}
	
	
	
	

	
		
	
}

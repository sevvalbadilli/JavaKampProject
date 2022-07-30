package gameProject.entities;

import java.util.Date;

import gameProject.interfaces.Entity;

public class Gamer implements Entity {

	private int id;
	private String userName;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String tckno;

	public Gamer() {

	}

	public Gamer(int id, String userName, String firstName, String lastName, Date dateOfBirth, String tckno) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.tckno = tckno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getTckno() {
		return tckno;
	}

	public void setTckno(String tckno) {
		this.tckno = tckno;
	}
	
	

}

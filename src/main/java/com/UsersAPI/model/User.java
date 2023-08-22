package com.UsersAPI.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "users")
public class User {
	@Id
	@Column (name = "login", unique = true, nullable = false) 
	private String login;
	@Column (name = "userpassword", nullable = false)
	private String userpassword;
	@Column (name = "username", nullable = false)
	private String username;
	@Column (name = "clientnumber", nullable = false)
	private float clientnumber;
	@Column (name = "email", nullable = false)
	private String email;
	@Column (name = "registrationdate", nullable = false)
	@CreationTimestamp
	private Date registrationdate;
	@Column (name = "terminationdate", nullable = false)
	private Date terminationdate;
	@Column (name = "clientstatus", nullable = false)
	private String clientstatus;
	
	public User(String login, String userpassword, String username, float clientnumber, String email,
			Date registrationdate, Date terminationdate, String clientstatus) {
		super();
		this.login = login;
		this.userpassword = userpassword;
		this.username = username;
		this.clientnumber = clientnumber;
		this.email = email;
		this.registrationdate = registrationdate;
		this.terminationdate = terminationdate;
		this.clientstatus = clientstatus;
	}//constructor
	
	public User() {
		
	}//default constructor

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public float getClientnumber() {
		return clientnumber;
	}

	public void setClientnumber(float clientnumber) {
		this.clientnumber = clientnumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRegistrationdate() {
		return registrationdate;
	}

	public void setRegistrationdate(Date registrationdate) {
		this.registrationdate = registrationdate;
	}

	public Date getTerminationdate() {
		return terminationdate;
	}

	public void setTerminationdate(Date terminationdate) {
		this.terminationdate = terminationdate;
	}

	public String getClientstatus() {
		return clientstatus;
	}

	public void setClientstatus(String clientstatus) {
		this.clientstatus = clientstatus;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", userpassword=" + userpassword + ", username=" + username + ", clientnumber="
				+ clientnumber + ", email=" + email + ", registrationdate=" + registrationdate + ", terminationdate="
				+ terminationdate + ", clientstatus=" + clientstatus + "]";
	}	
	
}//class User






package com.example.demo.model;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="userid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="emailid")
	private String emailid;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	
	
	@OneToMany( 
			mappedBy= "user",
			cascade=CascadeType.ALL,
			orphanRemoval = true
			)
//	@JoinColumn(name="contactfk")
	private List<Contact> contactlist;
	
	
	
	public List<Contact> getContactlist() {
		return contactlist;
	}
	public void setContactlist(List<Contact> contactlist) {
		this.contactlist = contactlist;
	}
	
}

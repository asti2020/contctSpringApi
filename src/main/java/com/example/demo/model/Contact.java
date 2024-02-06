package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="Contact")

public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="contactid")
	private int contactid;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="mobilenumber")
	private String mobilenumber;
	@Column(name="officenumber")
	private String officenumber;
	@Column(name="email")
	private String email;
	@Column(name="city")
	private String city;
	
	
//	public int getContactid() {
//		return contactid;
//	}
//	public void setContactid(int contactid) {
//		this.contactid = contactid;
//	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getOfficenumber() {
		return officenumber;
	}
	public void setOfficenumber(String officenumber) {
		this.officenumber = officenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@ManyToOne
	@JoinColumn(name="User_fk")
	private User user;


	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}

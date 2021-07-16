package com.te.gmail;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "account")
public class Gmail implements Serializable {

	@Id
	@Column(name = "id")
	private int User_id;
	@Column(name = "name")
	private String User_name;
	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private String email;

	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		User_id = user_id;
	}

	public String getUser_name() {
		return User_name;
	}

	public void setUser_name(String user_name) {
		User_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User_id=" + User_id + ", User_name=" + User_name + ", password=" + password + ", email=" + email
				+ "]";
	}

}

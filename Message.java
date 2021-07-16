package com.te.gmail;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "massage_inbox")
public class Message {

	@Id
	@Column(name = "massage_id")
	private int massageId;
	@Column(name = "id")
	private int User_id;
	@Column(name = "massage")
	private String massage;

	public int getMassageId() {
		return massageId;
	}

	public void setMassageId(int massageId) {
		this.massageId = massageId;
	}

	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		User_id = user_id;
	}

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}

	@Override
	public String toString() {
		return "Massage [massageId=" + massageId + ", User_id=" + User_id + ", massage=" + massage + "]";
	}
}

package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class PrescriptionData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prescriptionId;
	private int userId;
	private String userName;
	private String prescriptionName;
	private String uploadDateTime;
	@Lob
    @Column(columnDefinition = "TEXT")
	private String prescriptionData;

	public PrescriptionData(int userId, String userName, String prescriptionName, String uploadDateTime,
			String prescriptionData) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.prescriptionName = prescriptionName;
		this.uploadDateTime = uploadDateTime;
		this.prescriptionData = prescriptionData;
	}

	public PrescriptionData(int prescriptionId, int userId, String userName, String prescriptionName,
			String uploadDateTime, String prescriptionData) {
		super();
		this.prescriptionId = prescriptionId;
		this.userId = userId;
		this.userName = userName;
		this.prescriptionName = prescriptionName;
		this.uploadDateTime = uploadDateTime;
		this.prescriptionData = prescriptionData;
	}

	public PrescriptionData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPrescriptionName() {
		return prescriptionName;
	}

	public void setPrescriptionName(String prescriptionName) {
		this.prescriptionName = prescriptionName;
	}

	public String getUploadDateTime() {
		return uploadDateTime;
	}

	public void setUploadDateTime(String uploadDateTime) {
		this.uploadDateTime = uploadDateTime;
	}

	public String getPrescriptionData() {
		return prescriptionData;
	}

	public void setPrescriptionData(String prescriptionData) {
		this.prescriptionData = prescriptionData;
	}

}

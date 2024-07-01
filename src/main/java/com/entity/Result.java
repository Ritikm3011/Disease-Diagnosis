package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Result {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int resultId;
	private int userId;
	private String name;
	private String gender;
	private String dob;
	private String blood_group;
	private String medication;
	private String taking_medication;
	private String diagnose;
	private String symptoms1;
	private String symptoms2;
	private String symptoms3;
	private String symptoms4;
	private String symptoms5;
	private String symptoms6;
	private String result;
	private String dateTime;

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(int resultId, int userId, String name, String gender, String dob, String blood_group,
			String medication, String taking_medication, String diagnose, String symptoms1, String symptoms2,
			String symptoms3, String symptoms4, String symptoms5, String symptoms6, String result, String dateTime) {
		super();
		this.resultId = resultId;
		this.userId = userId;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.blood_group = blood_group;
		this.medication = medication;
		this.taking_medication = taking_medication;
		this.diagnose = diagnose;
		this.symptoms1 = symptoms1;
		this.symptoms2 = symptoms2;
		this.symptoms3 = symptoms3;
		this.symptoms4 = symptoms4;
		this.symptoms5 = symptoms5;
		this.symptoms6 = symptoms6;
		this.result = result;
		this.dateTime = dateTime;
	}

	public Result(int userId, String name, String gender, String dob, String blood_group, String medication,
			String taking_medication, String diagnose, String symptoms1, String symptoms2, String symptoms3,
			String symptoms4, String symptoms5, String symptoms6, String result, String dateTime) {
		super();
		this.userId = userId;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.blood_group = blood_group;
		this.medication = medication;
		this.taking_medication = taking_medication;
		this.diagnose = diagnose;
		this.symptoms1 = symptoms1;
		this.symptoms2 = symptoms2;
		this.symptoms3 = symptoms3;
		this.symptoms4 = symptoms4;
		this.symptoms5 = symptoms5;
		this.symptoms6 = symptoms6;
		this.result = result;
		this.dateTime = dateTime;
	}

	public int getResultId() {
		return resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getMedication() {
		return medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public String getTaking_medication() {
		return taking_medication;
	}

	public void setTaking_medication(String taking_medication) {
		this.taking_medication = taking_medication;
	}

	public String getDiagnose() {
		return diagnose;
	}

	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}

	public String getSymptoms1() {
		return symptoms1;
	}

	public void setSymptoms1(String symptoms1) {
		this.symptoms1 = symptoms1;
	}

	public String getSymptoms2() {
		return symptoms2;
	}

	public void setSymptoms2(String symptoms2) {
		this.symptoms2 = symptoms2;
	}

	public String getSymptoms3() {
		return symptoms3;
	}

	public void setSymptoms3(String symptoms3) {
		this.symptoms3 = symptoms3;
	}

	public String getSymptoms4() {
		return symptoms4;
	}

	public void setSymptoms4(String symptoms4) {
		this.symptoms4 = symptoms4;
	}

	public String getSymptoms5() {
		return symptoms5;
	}

	public void setSymptoms5(String symptoms5) {
		this.symptoms5 = symptoms5;
	}

	public String getSymptoms6() {
		return symptoms6;
	}

	public void setSymptoms6(String symptoms6) {
		this.symptoms6 = symptoms6;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	

	

}

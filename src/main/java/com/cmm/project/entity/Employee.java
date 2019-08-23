package com.cmm.project.entity;
import java.security.Timestamp;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "employee" )
public class Employee {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	public long emp_id;
		
	
	@Column(name = "employee_id")
	public long employee_id;
		
	@Column(name = "employee_name")
	public String employee_name;
	
	@Column(name = "date_of_birth")
	public long date_of_birth;
	
	@Column(name = "age")
	public int age;
	
	@Column(name = "gender")
	public String gender;
	
	@Column(name = "note")
	public String note;
	
	@Column(name = "del_fla")
	public int del_fla;
	
	@Column(name = "password")
	public String password;
	
	@Column(name = "created_date")
	public Timestamp created_date;
	
	@Column(name = "updated_date")
	public Timestamp updated_date;
	
	 @OneToMany(mappedBy="emp")
	    private Set<Attendance> attendance;

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public long getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(long date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getDel_fla() {
		return del_fla;
	}

	public void setDel_fla(int del_fla) {
		this.del_fla = del_fla;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}

	public Timestamp getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Timestamp updated_date) {
		this.updated_date = updated_date;
	}

	public Set<Attendance> getAttendance() {
		return attendance;
	}

	public void setAttendance(Set<Attendance> attendance) {
		this.attendance = attendance;
	}




	

	
}

package com.cmm.project.entity;
import java.security.Timestamp;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "employee_attendance" )
public class Attendance {		
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attendance_id")
	public long attendance_id;
		
	
	@Column(name = "employee_id")
	public long employee_id;
		
	@Column(name = "employee_name")
	public String employee_name;
	
	@Column(name = "date")
	public long date;
	
	@Column(name = "day")
	public int day;
	
	@Column(name = "in_time")
	public Timestamp in_time;
	
	@Column(name = "out_time")
	public Timestamp out_time;
	
	@Column(name = "reason")
	public Long reason;
	
	@Column(name = "created_date")
	public Timestamp created_date;
	
	@Column(name = "updated_date")
	public Timestamp updated_date;
	
	   @ManyToOne
	    @JoinColumn(name="emp_id", nullable=false)
	    private Employee emp;
	   
	    public Attendance() {}

		public long getAttendance_id() {
			return attendance_id;
		}

		public void setAttendance_id(long attendance_id) {
			this.attendance_id = attendance_id;
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

		public long getDate() {
			return date;
		}

		public void setDate(long date) {
			this.date = date;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public Timestamp getIn_time() {
			return in_time;
		}

		public void setIn_time(Timestamp in_time) {
			this.in_time = in_time;
		}

		public Timestamp getOut_time() {
			return out_time;
		}

		public void setOut_time(Timestamp out_time) {
			this.out_time = out_time;
		}

		public Long getReason() {
			return reason;
		}

		public void setReason(Long reason) {
			this.reason = reason;
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

		public Employee getEmp() {
			return emp;
		}

		public void setEmp(Employee emp) {
			this.emp = emp;
		}
	
	
}

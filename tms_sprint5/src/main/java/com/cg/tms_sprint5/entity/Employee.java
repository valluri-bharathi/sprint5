package com.cg.tms_sprint5.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	public Employee() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EMPLOYEE")
	@SequenceGenerator(sequenceName = "seq_employee", allocationSize = 1, name = "SEQ_EMPLOYEE")
	//@Column(name = "employeeid")
	private int employeeId;
	//@Column(name = "employeename")
	private String employeeName;
	@OneToOne
	@JoinColumn(name = "roleid")
	//@Column(name = "role")
	private Roles role;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;

	}

	public Employee(String employeeName, Roles roleId) {
		super();
		this.employeeName = employeeName;
		this.role = roleId;
	}

	@Override
	public String toString() {
		return "employeeId=" + employeeId + ", employeeName=" + employeeName + ", roleId=" + role.getRoleId() + "";
	}

}

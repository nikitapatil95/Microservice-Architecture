package com.app.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="departments")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "department_name")
	private String departmentName;
	
	@Column(name = "department_address")
	private String departmentAddres;
	
	@Column(name = "department_code")
	private String departmentCode;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Long id, String departmentName, String departmentAddres, String departmentCode) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentAddres = departmentAddres;
		this.departmentCode = departmentCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddres() {
		return departmentAddres;
	}

	public void setDepartmentAddres(String departmentAddres) {
		this.departmentAddres = departmentAddres;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + ", departmentAddres=" + departmentAddres
				+ ", departmentCode=" + departmentCode + "]";
	}
	
	

}

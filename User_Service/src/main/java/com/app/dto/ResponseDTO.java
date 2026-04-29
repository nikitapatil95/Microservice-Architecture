package com.app.dto;

public class ResponseDTO {
	
	private UserDTO user;
	private DepartmentDTO department;
	
	public ResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseDTO(UserDTO user, DepartmentDTO department) {
		super();
		this.user = user;
		this.department = department;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "ResponseDTO [user=" + user + ", department=" + department + "]";
	}

	
	

}

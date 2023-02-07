package com.springjwtsecurity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="todos")
public class Todos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="todo_id")
	private int todoId;
	
	@Column(name="todo_name")
	private String todoName;
	
	@Column(name="todo_description")
	private String todoDescription;
	
	@Column(name="employee_id")
	private String employeeId;
	

	public Todos() {
		super();
	}


	public Todos(int todoId, String todoName, String todoDescription, String employeeId) {
		super();
		this.todoId = todoId;
		this.todoName = todoName;
		this.todoDescription = todoDescription;
		this.employeeId = employeeId;
	}

	public int getTodoId() {
		return todoId;
	}
	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}
	public String getTodoName() {
		return todoName;
	}
	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}
	public String getTodoDescription() {
		return todoDescription;
	}
	public void setTodoDescription(String todoDescription) {
		this.todoDescription = todoDescription;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}



	@Override
	public String toString() {
		return "Todos [todoId=" + todoId + ", todoName=" + todoName + ", todoDescription=" + todoDescription
				+ ", employeeId=" + employeeId + "]";
	}



	
	
	
	
	

}

package com.app.todo;

import java.time.LocalDate;
import java.util.Objects;

public class Task {

//	You can create a class Task with fields like taskId, taskName, 
//	description, taskDate, status, active.
//	taskId should be unique and generated automatically.
//	status should be either PENDING, IN PROGRESS or COMPLETED.
//	active should be either true or false. Deleted task will have active=false 
//	Newly added task should have default status as PENDING and active=true
	 static int counter;
	 private int taskId;
	 private String taskName;
	 private String description;
	 private LocalDate taskDate;
	 private StatusEnum status;
	 private boolean active;
	 
	 static {
		 counter = 1;
	 }

	 
	 
	public Task(String taskName, String description, LocalDate taskDate) {
		super();
		this.taskId = counter++; 
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status = StatusEnum.PENDING;
		this.active = true;
	}

	   public Task (int id) {
		   this.taskId = id;
	   }
	   
	   

	   public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	   public boolean equals(Object obj) {
		   
		   return this.taskId == ((Task)obj).taskId;
	   }


	@Override
	public String toString() {
		return "TaskId " + taskId +" Task taskName=" + taskName + ", description=" + description + ", taskDate=" + taskDate + ", status="
				+ status + ", active=" + active ;
	}
	 
	 
}

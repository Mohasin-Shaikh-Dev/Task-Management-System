package com.example.www.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.www.entity.Status;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TaskDto {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "title is mandatory")
	@Size(max =100,message = "title must have less than 100 characters")
	private String title;
	
	@NotBlank(message = "title is mandatory")
	@Size(max=500,message="description must be less that 500 character")
	private String description;
	
	@NotNull(message = "Due Date is mandotory")
	@FutureOrPresent(message = "due date must be today or in the future")
	private LocalDate dueDate;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDateTime createAt;

	@UpdateTimestamp
	private LocalDateTime updateAt;
	
	public TaskDto() {
		super();
	}
	
	public TaskDto(long id, String title, String description, LocalDate dueDate, Status status, LocalDateTime createAt, LocalDateTime updateAt) {
	    super();
	    this.id = id;
	    this.title = title;
	    this.description = description;
	    this.dueDate = dueDate;
	    this.status = status;
	    this.createAt = createAt;
	    this.updateAt = updateAt;
	}


	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	public LocalDateTime getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(LocalDateTime updateAt) {
		this.updateAt = updateAt;
	}
	
}

package com.example.www.mapper;

import org.springframework.stereotype.Component;

import com.example.www.dto.TaskDto;
import com.example.www.entity.Task;

//TaskMapper Class to map between the entity and dto class
@Component
public class TaskMapper {
	public Task toEntity(TaskDto taskDto)
	{
		Task task=new Task();
		task.setId(taskDto.getId());
		task.setTitle(taskDto.getTitle());
		task.setDescription(taskDto.getDescription());
		task.setStatus(taskDto.getStatus());
		task.setDueDate(taskDto.getDueDate());
		task.setStatus(taskDto.getStatus());
		task.setCreateAt(taskDto.getCreateAt());
		task.setUpdateAt(taskDto.getUpdateAt());
		return task;
	}
	
	
	public TaskDto toDto(Task task)
	{
		TaskDto taskDto=new TaskDto();
		taskDto.setId(task.getId());
		taskDto.setTitle(task.getTitle());
		taskDto.setDescription(task.getDescription());
		taskDto.setStatus(task.getStatus());
		taskDto.setDueDate(task.getDueDate());
		taskDto.setUpdateAt(task.getUpdateAt());
		taskDto.setCreateAt(task.getCreateAt());
		return taskDto;
	}
}

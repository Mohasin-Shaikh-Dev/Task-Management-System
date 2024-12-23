package com.example.www.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.www.dto.TaskDto;
import com.example.www.entity.Status;
import com.example.www.entity.Task;
import com.example.www.exception.TaskNotFound;
import com.example.www.mapper.TaskMapper;
import com.example.www.repository.TaskRepository;

import jakarta.validation.Valid;

@Service
public class TaskService {
	
	// get the bean of the @TaskRepository
	@Autowired
	private TaskRepository taskRepository;
	
	@Autowired
    private TaskMapper mapper;
	
	public TaskService(TaskRepository taskRepository2, TaskMapper taskMapper) {
		this.taskRepository=taskRepository2;
		this.mapper=taskMapper;
	}

	public TaskDto createTask(@Valid TaskDto taskDto) 
	{
		Task task=mapper.toEntity(taskDto); //map to ENTITY class
		Task addedTask=taskRepository.save(task);
		return mapper.toDto(addedTask);   //map to DTO class and return
				
	}

	public List<TaskDto> getAllTasks() 
	{
		List<TaskDto> allTasks=new ArrayList<>();
		
		//store the all task in List 
		taskRepository.findAll().forEach(obj -> {
			allTasks.add(mapper.toDto(obj));
		});
		return allTasks;
	}

	public TaskDto getTaskByID(long id)
	{
		Task getTaskById=taskRepository.findById(id).orElseThrow(()-> new TaskNotFound("Task Not Found"));
		return mapper.toDto(getTaskById);
	}

	public String deleteTask(long id) 
	{
		Task getTaskById=taskRepository.findById(id).orElseThrow(()-> new TaskNotFound("Task Not Found"));
		taskRepository.delete(getTaskById);
		return "Task Deleted successfully having id "+getTaskById.getId();
	}

	public TaskDto maskTaskAsComplete(long id) 
	{
		Task task=taskRepository.findById(id).orElseThrow(()-> new TaskNotFound("Task Not Found"));
		task.setStatus(Status.COMPLETED);
		taskRepository.save(task);
		return mapper.toDto(task);
	}

	public TaskDto updateTask(long id, @Valid TaskDto taskDto) 
	{
		Task task=taskRepository.findById(id).orElseThrow(()-> new TaskNotFound("Task Not Found"));
		task.setTitle(taskDto.getTitle());
		task.setDescription(taskDto.getDescription());
		task.setDueDate(taskDto.getDueDate());
		task.setStatus(taskDto.getStatus());
		task.setUpdateAt(taskDto.getUpdateAt());
		taskRepository.save(task);
		return mapper.toDto(task);
	}	
}

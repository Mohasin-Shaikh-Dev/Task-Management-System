package com.example.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.www.dto.TaskDto;
import com.example.www.service.TaskService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/tasks")
public class TaskController {
	@Autowired
	private TaskService taskService;
	
	@PostMapping
	public ResponseEntity<TaskDto> createTask(@Valid @RequestBody TaskDto taskDto)
	{
		return ResponseEntity.ok(taskService.createTask(taskDto));
	}
	
	@GetMapping
	public List<TaskDto> getAllTasks()
	{
		return taskService.getAllTasks(); 
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TaskDto> getTaskByID(@PathVariable long id)
	{
		return ResponseEntity.ok(taskService.getTaskByID(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTask(@PathVariable long id)
	{
		return ResponseEntity.ok(taskService.deleteTask(id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<TaskDto> udateTask(@PathVariable long id, @RequestBody TaskDto taskDto)
	{
		return ResponseEntity.ok(taskService.updateTask(id,taskDto));
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<TaskDto> maskTaskAsComplete(@PathVariable long id)
	{
		return ResponseEntity.ok(taskService.maskTaskAsComplete(id));
	}
	
	
}

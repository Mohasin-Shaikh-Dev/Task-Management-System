package com.example.www.customTest;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.www.dto.TaskDto;
import com.example.www.entity.Status;
import com.example.www.entity.Task;
import com.example.www.mapper.TaskMapper;
import com.example.www.repository.TaskRepository;
import com.example.www.service.TaskService;

@ExtendWith(MockitoExtension.class)
public class UserTaskTest {
	@Mock
	private TaskRepository taskRepository;

	@Mock
	private TaskMapper taskMapper;

	private TaskService taskService;

	Task task;
	TaskDto taskDto;

	@BeforeEach
	void setUp() {
		taskService = new TaskService(taskRepository, taskMapper);
		taskDto = new TaskDto(1L, "Task1", "This is a test task", LocalDate.now().plusDays(1), Status.PENDING,
				LocalDateTime.now(), LocalDateTime.now());

		task = new Task(1L, "Task1", "This is a test task", LocalDate.now().plusDays(1), Status.PENDING,
				LocalDateTime.now(), LocalDateTime.now());
	}

	/* Test Case for the CreteTask Service Method */
	@Test
	void testCreateTask() {
		TaskDto expectedTaskDto = new TaskDto(1L, "Test Task", "This is a test task", LocalDate.now().plusDays(1),
				Status.PENDING, LocalDateTime.now(), LocalDateTime.now());

		// Mock the behavior of the mapper and repository
		when(taskMapper.toEntity(taskDto)).thenReturn(task);
		when(taskRepository.save(task)).thenReturn(task);
		when(taskMapper.toDto(task)).thenReturn(expectedTaskDto);

		TaskDto result = taskService.createTask(taskDto);
		Assertions.assertNotNull(result); // Check if the result is not null
		Assertions.assertEquals(expectedTaskDto, result); // Ensure the result matches the expected DTO
	}

	/* Test Case for the getAllTask Service Method */
	@Test
	void testGetAllTask() {
		taskService.getAllTasks();
		verify(taskRepository).findAll();
	}

}

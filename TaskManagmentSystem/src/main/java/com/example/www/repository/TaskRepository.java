package com.example.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.www.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}

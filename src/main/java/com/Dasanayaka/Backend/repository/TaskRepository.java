package com.Dasanayaka.Backend.repository;

import com.Dasanayaka.Backend.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {

    public Task findByTask(String task);
    public List<Task> findByCompletedTrue();
    public List<Task> findByCompletedFalse();
    public List<Task> findAll();
    public Task getById(Long id);
}

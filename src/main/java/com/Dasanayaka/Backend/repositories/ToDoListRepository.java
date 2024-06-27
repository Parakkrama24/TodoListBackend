package com.Dasanayaka.Backend.repositories;

import com.Dasanayaka.Backend.models.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoListRepository extends JpaRepository<ToDoList,Long> {

    public ToDoList findByTask(String task);
    public List<ToDoList> findByCompletedTrue();
    public List<ToDoList> findByCompletedFalse();
    public List <ToDoList> findAll();
    public ToDoList getById(Long id);
}

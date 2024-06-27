package com.Dasanayaka.Backend.service;

import com.Dasanayaka.Backend.models.ToDoList;
import com.Dasanayaka.Backend.repositories.ToDoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoListService {

    @Autowired
    private ToDoListRepository toDoListRepository;

    public ToDoList createNewTask(ToDoList task){
        return toDoListRepository.save(task);
    }

    public List<ToDoList> getAllTask(){
        return toDoListRepository.findAll();
    }

    public ToDoList findTaskById(Long id){
        return toDoListRepository.getById(id);
    }
    public List<ToDoList> findByCompletedTasks(){
        return toDoListRepository.findByCompletedTrue();
    }

    public  List<ToDoList> findByNotCompletedTasks(){
        return  toDoListRepository.findByCompletedFalse();
    }

    public void deletedTasks(ToDoList task){
        toDoListRepository.delete(task);

    }

    public  ToDoList updateTask(ToDoList task){
        return toDoListRepository.save(task);
    }

}

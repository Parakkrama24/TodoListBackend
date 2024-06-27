package com.Dasanayaka.Backend.controllers;


import com.Dasanayaka.Backend.models.ToDoList;
import com.Dasanayaka.Backend.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/task")
public class ToDoListController {

    @Autowired
    private ToDoListService toDoListService;

    @GetMapping("/")
    public ResponseEntity<List<ToDoList>> getAllTask(){
        return ResponseEntity.ok(toDoListService.getAllTask());
    }

    @GetMapping("/completed")
    public  ResponseEntity<List<ToDoList>> getCompletedTask(){
        return ResponseEntity.ok(toDoListService.findByCompletedTasks());
    }

    @PostMapping("/")
    public  ResponseEntity<ToDoList> createTask(@RequestBody ToDoList task){
        return  ResponseEntity.ok(toDoListService.createNewTask(task));
    }

}

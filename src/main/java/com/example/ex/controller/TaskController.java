package com.example.ex.controller;

import com.example.ex.model.Task;
import com.example.ex.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@CrossOrigin
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/addTask")
    public ResponseEntity<?> addTask(@RequestBody Task task) {
        this.taskService.addTask(task);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

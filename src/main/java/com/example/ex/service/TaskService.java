package com.example.ex.service;

import com.example.ex.model.Task;
import com.example.ex.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void addTask(Task task) {
        this.taskRepository.addTask(task);
    }
}

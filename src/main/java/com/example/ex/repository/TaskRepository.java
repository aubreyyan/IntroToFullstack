package com.example.ex.repository;

import com.example.ex.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addTask(Task task) {
        this.jdbcTemplate.update("INSERT INTO TASKS.PRD (COMPLETED, TEXT) VALUES (?, ?)", task.getCompleted(), task.getText());
    }
}

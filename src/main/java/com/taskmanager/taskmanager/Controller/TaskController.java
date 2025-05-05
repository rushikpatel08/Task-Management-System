package com.taskmanager.taskmanager.Controller;

import com.taskmanager.taskmanager.Entity.Task;
import com.taskmanager.taskmanager.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/inserttask")
    public Task InsertTask(@RequestBody Task task)
    {
        return taskService.InsertTask(task);
    }
}

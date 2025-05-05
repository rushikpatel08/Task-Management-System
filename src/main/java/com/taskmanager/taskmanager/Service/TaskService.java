package com.taskmanager.taskmanager.Service;

import com.taskmanager.taskmanager.Entity.Task;
import com.taskmanager.taskmanager.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task InsertTask(Task task)
    {
        return taskRepository.save(task);
    }
}

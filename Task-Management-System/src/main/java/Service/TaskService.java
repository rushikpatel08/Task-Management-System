package Service;


import Entity.Task;
import Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository)
    {
        this.taskRepository=taskRepository;
    }


    public Task saveTask(Task task)
    {
        return taskRepository.save(task);
    }
}

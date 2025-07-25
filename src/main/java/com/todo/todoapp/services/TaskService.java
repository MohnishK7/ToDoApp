/**
 * @author mohnishkumar on 11 Jul, 2025 at 15:13:04
 */

package com.todo.todoapp.services;

import com.todo.todoapp.models.Task;
import com.todo.todoapp.repositry.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);

    }

    public void toggleTask(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Invalid id"));
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);

    }
}

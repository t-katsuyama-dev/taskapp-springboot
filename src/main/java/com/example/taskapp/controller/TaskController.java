package com.example.taskapp.controller;

import com.example.taskapp.entity.Task;
import com.example.taskapp.repository.TaskRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TaskController {

    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Task> taskList = taskRepository.findAll();
        model.addAttribute("tasks", taskList);
        return "index";
    }

    @PostMapping("/add")
    public String addTask(@RequestParam String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteTask(@RequestParam Long id) {
        taskRepository.deleteById(id);
        return "redirect:/";
    }

    @PostMapping("/toggle")
    public String toggleTask(@RequestParam Long id) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
        return "redirect:/";
    }

}


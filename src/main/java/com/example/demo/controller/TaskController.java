package com.example.demo.controller;

import com.example.demo.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.ElementCollection;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class TaskController {

    @Autowired
    TaskRepository taskRepository;

    @GetMapping("/task")
    @ElementCollection
    public List<Task> index(){
        return taskRepository.findAll();
    }

    @GetMapping("/task/{id}")
    public Task show(@PathVariable String id){
        int taskId = Integer.parseInt(id);
        return  taskRepository.findById(taskId).get();
    }

    @PostMapping("/task/get")
    public Task getTask(Map<String, String> body){
        int taskId = Integer.parseInt(body.get("id"));
        //log the variable body to the console
        System.out.println(body);
        return  taskRepository.findById(taskId).get();
    }


    @PostMapping("/task")
    public Task create(@RequestBody Map<String, String> body) {
        String date = body.get("date");
        String task = body.get("task");
        String priority = body.get("priority");
        String status = body.get("status");
        return taskRepository.save(new Task(date, task, priority, status));
    }


    @PutMapping("/task/{id}")
    public Task update(@PathVariable String id, Map<String, String> body){
        int taskId = Integer.parseInt(id);
        Task task = taskRepository.findById(taskId).get();
        task.setDate(body.get("date"));
        task.setTask(body.get("task"));
        task.setPriority(body.get("priority"));
        task.setStatus(body.get("status"));
        return taskRepository.save(task);
    }

    @DeleteMapping("task/{id}")
    public boolean delete(@PathVariable String id){
        int taskId = Integer.parseInt(id);
        taskRepository.deleteById(taskId);
        return true;
    }

    @PostMapping("/task/get-all")
    @ElementCollection
    public List<Task> getAll(){
        return taskRepository.findAll();
    }

    @PostMapping("/task/update")
    public Task updateTask(Map<String, String> body){
        int taskId = Integer.parseInt(body.get("id"));
        // getting task
        Task task = taskRepository.findById(taskId).get();
        task.setDate(body.get("date"));
        task.setTask(body.get("task"));
        task.setPriority(body.get("priority"));
        task.setStatus(body.get("status"));
        return taskRepository.save(task);
    }

    @PostMapping("task/delete")
    public boolean deleteTask(Map<String, String> body){
        int taskId = Integer.parseInt(body.get("id"));
        taskRepository.deleteById(taskId);
        return true;
    }

}

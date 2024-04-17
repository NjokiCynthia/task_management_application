package com.example.demo.repository;
import java.util.List;

import com.example.demo.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    // custom query to search to task by maybe priority or status
    List<Task> findByTitleContainingOrContentContaining(String text, String textAgain);
}

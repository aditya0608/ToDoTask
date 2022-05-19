package com.aditya.todotask.ToDo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository  extends JpaRepository<ToDo,String> {
}

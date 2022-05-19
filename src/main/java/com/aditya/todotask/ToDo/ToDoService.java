package com.aditya.todotask.ToDo;

public interface ToDoService {

     ToDoDto addToDo(ToDoDto toDoDto);
     ToDoDto deleteToDo(String todoId);

}

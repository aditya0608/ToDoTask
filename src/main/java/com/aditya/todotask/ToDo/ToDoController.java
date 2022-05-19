package com.aditya.todotask.ToDo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @PostMapping
    public ResponseEntity<ToDoDto> createToDo(@RequestBody ToDoDto toDoDto)
    {
       ToDoDto dto= toDoService.addToDo(toDoDto);
       return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    @DeleteMapping("/{toDoId}")
    public ResponseEntity<ToDoDto> deleteToDo(@PathVariable String toDoId )
    {
        ToDoDto dto=toDoService.deleteToDo(toDoId);
        return new ResponseEntity<>(dto, HttpStatus.ACCEPTED);
    }
}

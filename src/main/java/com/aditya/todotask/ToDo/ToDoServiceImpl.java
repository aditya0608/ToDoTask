package com.aditya.todotask.ToDo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ToDoServiceImpl implements  ToDoService{
    @Autowired
    ToDoRepository toDoRepository;
    @Override
    public ToDoDto addToDo(ToDoDto toDoDto) {
        ToDo todo= toDoRepository.save(dtoToEntity(toDoDto));
        return entityToDto(todo);
    }

    @Override
    public ToDoDto deleteToDo(String todoId) {
        Optional<ToDo> todo=toDoRepository.findById(todoId);
        if(todo.isPresent())
        toDoRepository.deleteById(todoId);
        else
            throw new IllegalArgumentException("Does not exist record ");
        return entityToDto(todo.get());
    }
    public ToDo dtoToEntity(ToDoDto dto)
    {
        return new ToDo().builder().task(dto.getTask()).build();
    }
    public ToDoDto entityToDto(ToDo toDo)
    {
        return new ToDoDto().builder().task(toDo.getTask()).id(toDo.getId()).message("Query Succesfull ").build();
    }
}

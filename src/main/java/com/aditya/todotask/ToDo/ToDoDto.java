package com.aditya.todotask.ToDo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ToDoDto {

    private String message;
    private String task;
    private String id;
}

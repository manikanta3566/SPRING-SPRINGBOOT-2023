package com.practice.todo.service;

import com.practice.todo.dto.TodoDto;

import java.util.List;

public interface TodoService {

    TodoDto createdTodo(TodoDto todoDto);

    List<TodoDto> getAllTodos();

    TodoDto getTodoById(String id);

    void deleteTodo(String id);

    TodoDto updateTodo(TodoDto todoDto,String id);


}

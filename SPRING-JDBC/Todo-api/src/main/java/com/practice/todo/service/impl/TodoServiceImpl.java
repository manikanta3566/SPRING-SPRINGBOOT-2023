package com.practice.todo.service.impl;

import com.practice.todo.dao.TodoDao;
import com.practice.todo.dto.TodoDto;
import com.practice.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoDao todoDao;

    @Override
    public TodoDto createdTodo(TodoDto todoDto) {
        return todoDao.insertTodo(new TodoDto(todoDto.getTitle(),todoDto.getContent(),todoDto.getStatus()));
    }

    @Override
    public List<TodoDto> getAllTodos() {
        return todoDao.getAllTodos();
    }

    @Override
    public TodoDto getTodoById(String id) {
        return todoDao.getTodoById(id);
    }

    @Override
    public void deleteTodo(String id) {
        todoDao.deleteTodo(id);
    }

    @Override
    public TodoDto updateTodo(TodoDto todoDto, String id) {
        return todoDao.updateTodo(id, todoDto);
    }
}

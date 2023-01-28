package com.practice.todo.controller;


import com.practice.todo.dto.TodoDto;
import com.practice.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public ResponseEntity<TodoDto> createTodo(@RequestBody TodoDto todoDto) {
        return new ResponseEntity<>(todoService.createdTodo(todoDto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TodoDto>> getAllTodos() {
        return new ResponseEntity<>(todoService.getAllTodos(), HttpStatus.OK);
    }

    @GetMapping("{todoId}")
    public ResponseEntity<TodoDto> getTodoById(@PathVariable("todoId") String id) {
        return new ResponseEntity<>(todoService.getTodoById(id), HttpStatus.OK);
    }

    @PutMapping("{todoId}")
    public ResponseEntity<TodoDto> updateTodo(@RequestBody TodoDto todoDto, @PathVariable("todoId") String id) {
        return new ResponseEntity<>(todoService.updateTodo(todoDto, id), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("{todoId}")
    public ResponseEntity<String> deleteTodo(@PathVariable("todoId") String id) {
        todoService.deleteTodo(id);
        return new ResponseEntity<>("todo deleted successsfully", HttpStatus.OK);
    }
}

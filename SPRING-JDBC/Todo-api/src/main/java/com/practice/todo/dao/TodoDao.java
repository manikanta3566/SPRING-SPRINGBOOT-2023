package com.practice.todo.dao;

import com.practice.todo.dto.TodoDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoDao {

    Logger log = LoggerFactory.getLogger(TodoDao.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public TodoDto insertTodo(TodoDto todoDto) {
        String insertQuery = "insert into todo(id,title,content,status,created_date)values(?,?,?,?,?)";
        int rows = jdbcTemplate.update(insertQuery, todoDto.getId(), todoDto.getTitle(), todoDto.getContent(), todoDto.getStatus().toString(), todoDto.getCreatedDate());
        log.info("inserted rows {}", rows);
        return todoDto;
    }

    public TodoDto getTodoById(String id) {
        String query = "select * from todo where id=?";
        return jdbcTemplate.queryForObject(query, new TodoRowMapper(),id);
    }

    public List<TodoDto> getAllTodos() {
        String query = "select * from todo";
        return jdbcTemplate.query(query,new TodoRowMapper());
    }

    public TodoDto updateTodo(String id, TodoDto todoDto) {
        String query = "update todo set title=?,content=?,status=? where id=?";
        int rows = jdbcTemplate.update(query, todoDto.getTitle(), todoDto.getContent(), todoDto.getStatus().toString(), id);
        log.info("updated rows {}", rows);
        return todoDto;
    }

    public void deleteTodo(String id) {
        String query = "delete from todo where id=?";
        int rows = jdbcTemplate.update(query, id);
        log.info("deleted rows {}", rows);
    }
}

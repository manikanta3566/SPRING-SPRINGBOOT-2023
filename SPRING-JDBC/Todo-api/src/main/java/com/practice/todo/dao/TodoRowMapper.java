package com.practice.todo.dao;

import com.practice.todo.dto.TodoDto;
import com.practice.todo.enums.TodoStatus;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class TodoRowMapper implements RowMapper<TodoDto> {
    @Override
    public TodoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        TodoDto todoDto = new TodoDto();
        todoDto.setId(rs.getString("id"));
        todoDto.setTitle( rs.getString("title"));
        todoDto.setContent(rs.getString("content"));
        todoDto.setStatus(TodoStatus.valueOf((String) rs.getObject("status")));
        todoDto.setCreatedDate(((Timestamp) rs.getObject("created_date")).toLocalDateTime());
        return todoDto;
    }
}

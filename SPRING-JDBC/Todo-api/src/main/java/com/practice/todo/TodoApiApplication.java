package com.practice.todo;

import com.practice.todo.dao.TodoDao;
import com.practice.todo.helper.CommonUtils;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

@SpringBootApplication
public class TodoApiApplication {

    Logger log = LoggerFactory.getLogger(TodoApiApplication.class);


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(TodoApiApplication.class, args);
    }

    @PostConstruct
    public void createTables() throws SQLException {
        String createTodoQuery = null;
        if (!CommonUtils.tableExists(jdbcTemplate.getDataSource().getConnection(), "todo")) {
            createTodoQuery = "create table  todo(id varchar(100) primary key,title varchar(100) not null,content varchar(500),status varchar(100),created_date timestamp)";
            int rows = jdbcTemplate.update(createTodoQuery);
            log.info("created table {}", rows);
        }
    }

}


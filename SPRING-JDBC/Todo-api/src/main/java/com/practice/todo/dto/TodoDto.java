package com.practice.todo.dto;

import com.practice.todo.enums.TodoStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public class TodoDto {

    private String id;

    private String title;

    private String content;

    private TodoStatus status;

    private LocalDateTime createdDate;

    public TodoDto() {
    }

    public TodoDto( String title, String content, TodoStatus Status) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.content = content;
        this.status = Status;
        this.createdDate=LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TodoStatus getStatus() {
        return status;
    }

    public void setStatus(TodoStatus Status) {
        this.status = Status;
    }


    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "TodoDto{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", Status=" + status +
                ", createdDate=" + createdDate +
                '}';
    }
}

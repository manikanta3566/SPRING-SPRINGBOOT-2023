package com.practice.todo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

@RestController
@RequestMapping("/v0/files")
public class FileController {

    Logger logger = LoggerFactory.getLogger(FileController.class);

    //    single file handler
    @PostMapping("/single")
    public ResponseEntity<String> uploadSingleFile(@RequestParam("file") MultipartFile file) {
        logger.info("file name {}", file.getOriginalFilename());
        logger.info("file type {}", file.getContentType());
        return new ResponseEntity<>("file uploaded", HttpStatus.ACCEPTED);
    }

    //    multiple file handler
    @PostMapping("/multiple")
    public ResponseEntity<String> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        Arrays.stream(files).forEach(file->{
            logger.info("file name {}", file.getOriginalFilename());
            logger.info("file type {}", file.getContentType());
            logger.info("------------------------------------");
        });
        return new ResponseEntity<>("file uploaded", HttpStatus.ACCEPTED);
    }
}


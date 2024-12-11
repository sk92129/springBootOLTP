package com.kangengineering.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/")
final class CategoryController {

    Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @GetMapping({ "/" })
    public String home(
            ) {
        logger.info("home has been called");
       return "hello world";
    }


}

package com.uade.tpo.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categories")
public class CategoriesControllers {

@GetMapping
public String getCategories(){
    return new String();
}

// @GetMapping("/{categoryId}")
// public String getCategoryById(@PathVariable)

    

}

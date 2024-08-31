package com.api.blog.controller;

import com.api.blog.model.BlogModel;
import com.api.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    // Create a new Blog Post
    @PostMapping("/create")
    public BlogModel createPost(@RequestBody BlogModel blogModel){
        return blogService.createPost(blogModel);
    }

    //Get all Blog
    @GetMapping("/list")
    public List<BlogModel> getAllBlog(){
        return  blogService.getAllBlog();
    }
}

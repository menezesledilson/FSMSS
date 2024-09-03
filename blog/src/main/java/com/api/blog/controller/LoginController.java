package com.api.blog.controller;

import com.api.blog.model.BlogModel;
import com.api.blog.model.LoginModel;
import com.api.blog.service.BlogService;
import com.api.blog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/login")
public class LoginController {

        @Autowired
        private LoginService loginService;

        // Create a new Blog Post
        @PostMapping("/create")
        public LoginModel createPost(@RequestBody LoginModel loginModel){
            return loginService.createPost(loginModel);
        }

        //Get all Blog
        @GetMapping("/list")
        public List<LoginModel> getAllLogin(){
            return  loginService.getAllLogin();
        }
}

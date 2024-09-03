package com.api.blog.service;

import com.api.blog.model.LoginModel;
import com.api.blog.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    LoginRepository loginRepository;

    //Create a new Login
    public LoginModel createPost(LoginModel loginModel){
        return  loginRepository.save(loginModel);
    }
    //List the Login
    public List<LoginModel> getAllLogin(){
        return loginRepository.findAll();
    }

}

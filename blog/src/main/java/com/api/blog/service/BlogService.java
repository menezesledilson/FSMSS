package com.api.blog.service;

import com.api.blog.model.BlogModel;
import com.api.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    BlogRepository blogRepository;

    // Create a new publication
    public BlogModel createPost(BlogModel blogModel){
        return blogRepository.save(blogModel);
    }

    // list the publication
    public List<BlogModel> getAllBlog(){
        return blogRepository.findAll();
    }
}

package com.api.blog.repository;

import com.api.blog.model.BlogModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<BlogModel, Long> {

}

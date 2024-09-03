package com.api.blog.repository;

import com.api.blog.model.LoginModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel,Long> {
}

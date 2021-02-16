package com.example.blog_app.repository;

import com.example.blog_app.model.jpa.User;
import com.example.blog_app.repository.base.BaseRepository;

public interface UserRepository extends BaseRepository<User, Long> {
    void deleteByUsername(String username);
}
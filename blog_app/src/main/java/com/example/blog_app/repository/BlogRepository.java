package com.example.blog_app.repository;

import com.example.blog_app.model.jpa.Blog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
} 
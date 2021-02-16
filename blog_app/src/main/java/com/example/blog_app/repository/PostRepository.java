package com.example.blog_app.repository;

import com.example.blog_app.model.jpa.Post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {}

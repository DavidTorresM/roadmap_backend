package com.example.blog_app.repository.base;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {
    
}

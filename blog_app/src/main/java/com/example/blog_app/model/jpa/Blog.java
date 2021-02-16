package com.example.blog_app.model.jpa;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder //
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"post"})
@EqualsAndHashCode(exclude = {"posts"}) 
@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @org.hibernate.annotations.Type(type = "pg-uuid")
    UUID guid;

    private String name;
    private String about;
    private LocalDateTime publishedAt;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,
            orphanRemoval = true, mappedBy = "blog")
    private Set<Post> posts;
}

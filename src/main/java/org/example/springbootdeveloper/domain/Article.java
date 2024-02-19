package org.example.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Getter
    @Column(name = "title", nullable = false)
    private String title;

    @Getter
    @Column(name = "content", nullable = false)
    private String content;
    @Column(length = 255)
    private String yourColumnName;

    @Builder
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }
    @CreatedDate
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private  LocalDateTime updateAt;

    public long getId() {
        return id;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}

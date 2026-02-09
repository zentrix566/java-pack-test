package com.fengqiao.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "poems")
@Data
public class Poem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    private String author;
}

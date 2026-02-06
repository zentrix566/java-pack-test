package com.fengqiao.entity;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "quotes")
@Data // 如果编译报错，说明没装Lombok，请手动写Getter/Setter
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    private String author;
}
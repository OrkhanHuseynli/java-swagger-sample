package com.sample.core.repository;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "article_domain")
public class ArticleDomain {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;
}

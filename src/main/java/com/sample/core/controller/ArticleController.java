package com.sample.core.controller;


import com.sample.core.Article;
import com.sample.core.api.ArticlesApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public class ArticleController implements ArticlesApi {

    public ResponseEntity<Void> postArticle(@RequestBody Article body) {
        System.out.println(body);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

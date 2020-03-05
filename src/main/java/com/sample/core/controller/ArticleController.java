package com.sample.core.controller;


import com.sample.core.Article;
import com.sample.core.GeneralResponse;
import com.sample.core.api.ArticlesApi;
import com.sample.core.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class ArticleController implements ArticlesApi {

    private final ArticleService articleService;

    public ResponseEntity<GeneralResponse> postArticle(@RequestBody Article body) {
        return articleService.postArticle(body);
    }
}

package com.sample.core.controller;


import com.sample.core.Article;
import com.sample.core.ArticleEntity;
import com.sample.core.GeneralResponse;
import com.sample.core.api.ArticlesApi;
import com.sample.core.service.ArticleService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@Controller
@AllArgsConstructor
public class ArticleController implements ArticlesApi {

    private final ArticleService articleService;

    public ResponseEntity<GeneralResponse> postArticle(@RequestBody Article body) {
        log.debug("Storing a new article: \"{}\"", body.getTitle());
        return articleService.postArticle(body);
    }

    public ResponseEntity<Article> getArticle(Integer articleID) {
        log.debug("Retrieving the article with ID: \"{}\"", articleID);
        return articleService.getArticle(articleID);
    }
}

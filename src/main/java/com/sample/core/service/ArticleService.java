package com.sample.core.service;

import com.sample.core.Article;
import com.sample.core.ArticleEntity;
import com.sample.core.GeneralResponse;
import com.sample.core.repository.ArticleDomain;
import com.sample.core.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ResponseEntity<GeneralResponse> postArticle(@RequestBody Article body) {

        ArticleDomain articleDomain = new ArticleDomain();
        articleDomain.setTitle(body.getTitle());
        articleDomain.setContent(body.getContent());

        ArticleDomain stored = articleRepository.save(articleDomain);

        GeneralResponse response = new GeneralResponse();
        if (stored == null) {
            response.setMessage("Error  while storing a new article! Please, try once more!");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(response);
        }


        response.setMessage(String.format("The article with title %s was successfully stored under ID number: %d",
                stored.getTitle(), stored.getId()));
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }


    public ResponseEntity<Article> getArticle(Integer articleID) {
        ArticleDomain domain = articleRepository.findById(articleID).get();
            Article article = new Article();
            article.setTitle(domain.getTitle());
            article.setContent(domain.getContent());
            return ResponseEntity.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(article);

    }


}

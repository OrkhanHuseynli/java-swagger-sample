package com.sample.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface ArticleRepository extends CrudRepository<ArticleDomain, Integer> {

    @Transactional
    Optional<ArticleDomain> findById(Integer articleId);

}

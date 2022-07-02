package org.binary.blogapp.controller;

import org.binary.blogapp.common.RestApiResponse;
import org.binary.blogapp.pojo.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/article")
public class ArticleController {



    @GetMapping(value = "/{id}")
    public RestApiResponse<Article> getArticleById(@PathVariable("id") Integer id) {



        return RestApiResponse.success();
    }
}

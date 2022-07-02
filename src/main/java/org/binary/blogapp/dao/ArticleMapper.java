package org.binary.blogapp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.binary.blogapp.pojo.Article;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleMapper extends BaseMapper<Article> {
}

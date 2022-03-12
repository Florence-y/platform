package com.innovation.platform.service.impl;

import com.innovation.platform.po.Article;
import com.innovation.platform.mapper.ArticleMapper;
import com.innovation.platform.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Florence
 * @since 2022-03-12
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}

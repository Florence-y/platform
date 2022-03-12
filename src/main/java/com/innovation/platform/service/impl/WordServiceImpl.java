package com.innovation.platform.service.impl;

import com.innovation.platform.po.Word;
import com.innovation.platform.mapper.WordMapper;
import com.innovation.platform.service.IWordService;
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
public class WordServiceImpl extends ServiceImpl<WordMapper, Word> implements IWordService {

}

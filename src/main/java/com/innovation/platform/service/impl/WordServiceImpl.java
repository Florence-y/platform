package com.innovation.platform.service.impl;

import com.innovation.platform.dto.WordDto;
import com.innovation.platform.po.User;
import com.innovation.platform.po.Word;
import com.innovation.platform.mapper.WordMapper;
import com.innovation.platform.service.IWordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<WordDto> getWordList(User user, int type, int page) {
        return null;
    }

    @Override
    public WordDto getWordInfo(User user, int id) {
        return null;
    }
}

package com.innovation.platform.service;

import com.innovation.platform.dto.WordDto;
import com.innovation.platform.po.User;
import com.innovation.platform.po.Word;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Florence
 * @since 2022-03-12
 */
public interface IWordService extends IService<Word> {
    List<WordDto> getWordList(User user, int type, int page);

    WordDto getWordInfo(User user, int id);


}

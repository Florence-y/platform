package com.innovation.platform.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.innovation.platform.po.User;
import org.junit.jupiter.api.Test;

public class JsonUtilsTest {

    @Test
    public void testCopyValue() throws JsonProcessingException {

        User srcUser = new User();
        User tarUser = new User();
        srcUser.setAvatarUrl("src");
        tarUser.setDataCode("tar");
        JsonUtil.addPropertiesToExistedObjByJsonStr(tarUser,JsonUtil.objToJsonNotIncludeNull(srcUser));
        System.out.println(srcUser);
        System.out.println(tarUser);
    }
}

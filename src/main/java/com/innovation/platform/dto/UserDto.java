package com.innovation.platform.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Florence
 * @since 2021-11-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户首次注册的类型
     */
    private Integer type;

    /**
     * 头像
     */
    private String avatarUrl;

    /**
     * 如果是app端，需要用这个获取用户信息
     */
    private String openid;

    /**
     * 数据一致码
     */
    private String dataCode;

    private String code;

    @JsonProperty("access_token")

    private String accessToken;
}

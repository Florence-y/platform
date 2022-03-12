package com.innovation.platform.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Florence
 * @since 2022-03-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String dataCode;

    private String nickName;

    @TableField("avatar_Url")
    private String avatarUrl;

    private String sex;

    private String personalSign;

    private String attentions;

    private String fans;

    private String favorite;

    private String publish;

    private String seen;

    private Integer experience;

    private Integer pictureFrame;

    private Integer theme;

    private Integer type;

    /**
     * app
     */
    private String openid;

    /**
     *  0 1
     */
    private Integer userType;


}

package com.innovation.platform.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class UserWordExplain implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * id
     */
    private Long userId;

    private String content;

    private String explain;


}

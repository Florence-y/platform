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
public class Hello implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * id
     */
    private Long editUserId;

    private String name;

    private String password;


    public Hello(Long id, Long editUserId, String name, String password) {
        this.id = id;
        this.editUserId = editUserId;
        this.name = name;
        this.password = password;
    }

    public Hello(String name, Long editUserId, String password) {
        this(null,editUserId,name,password);
    }
}

package com.innovation.platform.reply;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Florence
 */
@Data
@NoArgsConstructor
public class ResponseStat<T> {
    private String message;
    private T data;
    private String code;
    private Boolean flag;
    public ResponseStat(String message,String code,Boolean flag){
        this.message = message;
        this.code = code;
        this.flag = flag;
    }
    public ResponseStat(String message,String code,Boolean flag,T data){
        this.message = message;
        this.code = code;
        this.flag = flag;
        this.data = data;
    }
}

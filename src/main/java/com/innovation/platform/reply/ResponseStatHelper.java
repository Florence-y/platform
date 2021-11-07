package com.innovation.platform.reply;

/**
 * @author Florence
 */
public class ResponseStatHelper {

    public static  <T> ResponseStat<T> success(String message){
        return getResponseStat(message,"200000",true);
    }

    public static <T> ResponseStat<T> error(String message) {
        return getResponseStat(message,"500000",false);
    }

    public static <T> ResponseStat<T> getResponseStat(String message,String code,Boolean flag){
        return new ResponseStat(message,code,flag);
    }

    public static  <T> ResponseStat<T> success(String message, T data){
        return getResponseStat(message,"200000",true,data);
    }

    public static <T> ResponseStat<T> error(String message,T data) {
        return getResponseStat(message,"500000",false, data);
    }

    public static <T> ResponseStat<T> getResponseStat(String message,String code,Boolean flag, T data){
        return new ResponseStat(message,code,flag, data);
    }
}

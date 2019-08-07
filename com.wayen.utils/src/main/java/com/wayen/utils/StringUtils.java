package com.wayen.utils;

public class StringUtils {

    /**
     * 判断传入字符串是否为null或长度为0
     *
     * 空格算长度
     *
     * @param src
     * @return
     */
    public static boolean isEmpty(String src){
        if(src==null || src.length()==0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 拼接字符串
     *
     * null不处理
     *
     * @param params
     * @return
     */
    public static String concat(Object... params){
        StringBuffer sb = new StringBuffer();
        for (Object param:params) {
            if(null!=param){
                sb.append(param);
            }
        }
        return sb.toString();
    }
}

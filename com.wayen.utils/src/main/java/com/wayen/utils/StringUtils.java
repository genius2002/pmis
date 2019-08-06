package com.wayen.utils;

public class StringUtils {
    public static boolean isEmpty(String src){
        if(src==null || src.length()==0){
            return true;
        }else{
            return false;
        }
    }
}

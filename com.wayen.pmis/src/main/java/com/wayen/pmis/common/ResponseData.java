package com.wayen.pmis.common;

import lombok.Data;

import java.util.List;

@Data
public class ResponseData<T> {
    private Integer status;
    private String message;
    private List<T> data;
}

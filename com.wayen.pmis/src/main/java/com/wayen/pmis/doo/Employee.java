package com.wayen.pmis.doo;

import lombok.Data;

import java.util.Date;

@Data
public class Employee {
    /**
     * 名
     */
    private String firstName;
    /**
     * 姓
     */
    private String lastName;
    /**
     * 员工ID
     */
    private String empId;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 身份证号
     */
    private String idCard;
    private String telNo1;
    private String telNo2;
    private String telNo3;
    private String state;
    private Date dtEntry;
    private Date dtResign;
    private Date dtGraduated;
    private String graduatedFrom;
    private String major;
    private String degree;
    private String comment;
    private String sex;
}

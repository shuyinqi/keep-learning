package com.shuyinqi.jmeter.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by shuyinqi on 2018/3/1.
 * 用户信息
 */

@Data
public class UserInfo {


    private Long id;
    private String userName;
    private Date birty;
    private String card;




}

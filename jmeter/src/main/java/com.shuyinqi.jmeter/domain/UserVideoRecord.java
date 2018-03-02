package com.shuyinqi.jmeter.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by shuyinqi on 2018/3/1.
 * 观影记录
 */

@Data
public class UserVideoRecord {

    public Long id;
    public Long vid;
    public Long view_length;
    public Date createTime;
    public Integer efftive;


}

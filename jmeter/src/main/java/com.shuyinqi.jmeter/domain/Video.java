package com.shuyinqi.jmeter.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by shuyinqi on 2018/3/1.
 * 视频信息
 */
@Data
public class Video {

    public Long id;
    public String video_name;
    public String video_sub_name;
    public String video_desc;
    public Integer video_order;
    public Date publish_time;
    public String html5;

}

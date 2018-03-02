package com.shuyinqi.jmeter.domain;

import lombok.Data;

/**
 * Created by shuyinqi on 2018/3/1.
 * 专辑信息
 */
@Data
public class Album {

    public Long id;
    public String album_name;
    public  String album_sub_name;
    public String actor;
    public String album_publish_time;
    public Integer total_video_count;
    public Long season_id;
}

package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 服务器返回数据中的basic对象数据
 * Created by Administrator on 2020/7/18.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}

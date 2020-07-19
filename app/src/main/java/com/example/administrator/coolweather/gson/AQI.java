package com.example.administrator.coolweather.gson;

/**
 * 服务器返回数据中的api对象数据
 * Created by Administrator on 2020/7/18.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}

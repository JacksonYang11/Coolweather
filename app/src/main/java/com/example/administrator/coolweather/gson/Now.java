package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 服务器返回数据中的Now对象数据
 * Created by Administrator on 2020/7/18.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}

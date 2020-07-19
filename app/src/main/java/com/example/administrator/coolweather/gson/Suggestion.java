package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 服务器返回数据中的Suggestion对象数据
 * Created by Administrator on 2020/7/18.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}

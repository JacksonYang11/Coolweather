package com.example.administrator.coolweather.gson;

import android.media.midi.MidiOutputPort;

import com.google.gson.annotations.SerializedName;

/**
 * 服务器返回数据中的Forecast对象数据
 * Created by Administrator on 2020/7/18.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}

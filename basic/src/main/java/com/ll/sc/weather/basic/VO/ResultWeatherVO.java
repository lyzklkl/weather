package com.ll.sc.weather.basic.VO;

import lombok.Data;

@Data
public class ResultWeatherVO {
    private WeatherVO data;

    private Integer Status;

    private String desc;

}

package com.ll.sc.weather.basic.VO;

import lombok.Data;

import java.util.List;

@Data
public class WeatherVO {
    private Yesterday yesterday;
    private String city;
    private List<Forecast> forecast;
    private String ganmao;
    private String wendu;
}

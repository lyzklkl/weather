package com.ll.sc.weather.basic.service;

import com.ll.sc.weather.basic.VO.ResultWeatherVO;

public interface WeatherService {

    ResultWeatherVO getWartherByCityName(String cityName);

}

package com.ll.sc.weather.basic.controller;

import com.ll.sc.weather.basic.VO.ResultWeatherVO;
import com.ll.sc.weather.basic.service.WeatherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "查询天气接口", tags = "天气接口Controller")
public class WeatherController {
    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @ApiOperation(value = "通过城市名字查询天气情况", notes = "通过城市名字查询天气情况的接口")
    @GetMapping("/city/{city_name}")
    public ResultWeatherVO getWeatherByCityName(@PathVariable("city_name") String cityName) {
        return weatherService.getWartherByCityName(cityName);
    }

}

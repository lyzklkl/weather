package com.ll.sc.weather.basic.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ll.sc.weather.basic.BasicApplicationTests;
import com.ll.sc.weather.basic.VO.ResultWeatherVO;
import com.ll.sc.weather.basic.service.WeatherService;
import com.ll.sc.weather.basic.util.HttpClientUtils;
import com.ll.sc.weather.basic.util.RedisOperator;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherServiceImplTest extends BasicApplicationTests {

    @Autowired
    WeatherService weatherService;

    @Autowired
    private RedisOperator redisOperator;


    @Test
    public void t1() {
        String url = "http://wthrcdn.etouch.cn/weather_mini?city=深圳";


        JSONObject jsonObject = HttpClientUtils.httpGet(url);
        System.out.println(jsonObject);
    }

    @Test
    public void t2() {
        ResultWeatherVO vo = weatherService.getWartherByCityName("深圳");

        System.out.println(vo);
    }

    @Test
    public void t3() {
        redisOperator.set("123", "123", 10);

    }

}
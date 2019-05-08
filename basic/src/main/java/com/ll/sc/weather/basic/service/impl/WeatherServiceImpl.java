package com.ll.sc.weather.basic.service.impl;

import com.alibaba.fastjson.JSON;
import com.ll.sc.weather.basic.VO.ResultWeatherVO;
import com.ll.sc.weather.basic.service.WeatherService;
import com.ll.sc.weather.basic.util.HttpClientUtils;
import com.ll.sc.weather.basic.util.RedisOperator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService {



    @Autowired
    private RedisOperator redisOperator;


    @Override
    public ResultWeatherVO getWartherByCityName(String cityName) {
        String url = "http://wthrcdn.etouch.cn/weather_mini?city=" + cityName;

        String s = redisOperator.get(url);

        if (null == s) {
            log.info("本次请求,调用远程第三方接口");

            s = HttpClientUtils.httpGet(url).toJSONString();
            //第一个值key, 第二个值value,第三个值秒
            redisOperator.set(url, s, 30);
        } else {
            log.info("本次请求,调用redis");
        }



        ResultWeatherVO resultWeatherVO = JSON.parseObject(s, ResultWeatherVO.class);

        return resultWeatherVO;
    }
}




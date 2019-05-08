package com.ll.sc.weather.basic.config;

import com.ll.sc.weather.basic.job.WeatherJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
    //jobDetail
    @Bean
    public JobDetail weatherJobDetail() {
        return JobBuilder
                .newJob(WeatherJob.class)
                .withIdentity("weatherJobDetail")
                .storeDurably()
                .build();
    }


    //Trigger
    @Bean
    public Trigger weatherJobTrigger() {
        SimpleScheduleBuilder scheduleBuilder =
                SimpleScheduleBuilder
                        .simpleSchedule()
                        .withIntervalInSeconds(10)
                        .repeatForever();

        return TriggerBuilder
                .newTrigger()
                .forJob(weatherJobDetail())
                .withIdentity("weatherJobTrigger")
                .withSchedule(scheduleBuilder)
                .build();
    }

}

package com.ll.sc.weather.basic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Component
@EnableSwagger2
public class Swagger2 {


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ll.sc.weather.basic"))
                .paths(PathSelectors.any())
                .build();
    }


    /**
     * 构建API文档信息
     * @return
     */
    @Bean
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("天气预报文档")
                .contact(new Contact("李育真",null,"8679138@qq.com"))
                .description("天气预报Api接口文档,目前只提供城市查询端口")
                .version("1.0")
                .build();
    }

}

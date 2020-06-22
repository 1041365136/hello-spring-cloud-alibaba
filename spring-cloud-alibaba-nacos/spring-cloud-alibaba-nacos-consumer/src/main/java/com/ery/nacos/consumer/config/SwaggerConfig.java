package com.ery.nacos.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket getDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("Nacos消费者的接口")
                        .description("提供各种Nacos消费者的接口")
                        .contact(new Contact("Erythron","http://www.baidu.com","1041365136@qq.com"))
                        .termsOfServiceUrl("http://www.baidu.com")
                        .version("v1.0")
                        .build()
                ).select()
                //指明去哪儿找api(Controller)
                .apis(RequestHandlerSelectors.basePackage("com.ery.nacos.consumer.controller"))
                .build();
    }

}

package com.springboot.swagger.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
            return new Docket(DocumentationType.SWAGGER_2)
                    .pathMapping("/")
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.springboot.swagger"))
                    .paths(PathSelectors.any())
                    .build()
                    .apiInfo(new ApiInfoBuilder().title("管理系统").description("运输管理系统")
                            .version("1.0.0")
                            /*.contact(new Contact("hong","127.0.0.1","asd@d.com"))*/
                           /* .license("licence")
                            .licenseUrl("www.baidu.com")*/
                            .build()
                    );
    }
}

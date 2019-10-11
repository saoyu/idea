package com.shaoyu.dvauser.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *  swagger配置类
 * @author leeshoayu
 * @date 2019/8/20
 */
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = "com.shaoyu.dvauser.controller")
public class SwaggerConfig {

    /**
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.shaoyu.dvauser.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger在线测试")
                .description("Swagger在线测试")
                .contact("tel:18373213021")
                .version("1.0")
                .build();
    }
}

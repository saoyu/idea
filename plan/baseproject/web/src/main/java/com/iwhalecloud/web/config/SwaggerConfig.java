package com.iwhalecloud.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
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
//@EnableWebMvc
//@ComponentScan(basePackages = "com.iwhalecloud.web.controller" )
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
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .apis(RequestHandlerSelectors.basePackage("com.iwhalecloud.web.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("天青色等烟雨，而我在等你")
                .description("Swagger在线测试")
                .contact("tel:18373213021")
                .version("1.0")
                .build();
    }
}

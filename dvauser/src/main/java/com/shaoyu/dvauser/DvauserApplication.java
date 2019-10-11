package com.shaoyu.dvauser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.shaoyu.dvauser.mapper")
@SpringBootApplication
@EnableSwagger2
public class DvauserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DvauserApplication.class, args);
	}

}

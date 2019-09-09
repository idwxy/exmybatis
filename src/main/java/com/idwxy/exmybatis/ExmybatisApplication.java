package com.idwxy.exmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Spring boot 主入口, @MapperScan 可以指定扫描 mapper 类包路径，减少了每个 mapper 类都要加 @Mapper 注解
@SpringBootApplication
@MapperScan("com.idwxy.exmybatis.dao")
public class ExmybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExmybatisApplication.class, args);
	}

}

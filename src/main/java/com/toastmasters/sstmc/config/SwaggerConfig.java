package com.toastmasters.sstmc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket buildDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors
						.basePackage("com.toastmasters.sstmc.controller")) // 要扫描的API(Controller)基础包
				.paths(PathSelectors.any()) // and by paths
				.build().apiInfo(buildApiInf());
	}

	private ApiInfo buildApiInf() {
		return new ApiInfoBuilder().title("Spring Boot中使用Swagger2 UI构建API文档")
				.contact(
						new Contact("walter", "https://blog.csdn.net/ItsWalter",
								"walter1202@126.com"))
				.version("1.0.0").build();
	}
}
package org.anowls.spring.swanim.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * <p>Title: edu-cloud-network-learning</p>
 * <p>Description: [Swan-Im]-Swagger Settings</p>
 * <p>Copyright: Copyright © 2017-2020 汉博德信息技术有限公司 All Rights Reserved</p>
 * <p>Company: http://www.hanboard.com</p>
 *
 * @author haopeisong
 * @date 2018/1/4
 */
@Configuration
public class Swagger2Configuration {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("org.anowls.spring.swanim"))
            .paths(PathSelectors.any())
            .build();

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Swan-Im 服务 RESTFUL API")
            .description("使用 Swagger2 构建 RESTFUL API 文档")
            .contact(new Contact("Swan-Im", "", "fpky_0729@126.com"))
            .version("1.0")
            .build();
    }

}

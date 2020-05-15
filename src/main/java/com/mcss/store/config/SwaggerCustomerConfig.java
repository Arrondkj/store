package com.mcss.store.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author Arron
 * @Date 2020/5/15 8:40
 * @Version 1.0
 * @Description: 配置Swagger接口文档
 */
@Configuration
@EnableSwagger2
public class SwaggerCustomerConfig {

    /**
     * 用户测试
     *
     * @param environment 配置文件的环境
     * @return
     */
    @Bean
    public Docket docketUser(Environment environment) {

        // 设置要显示的swagger环境
        Profiles profiles = Profiles.of("dev");

        // 通过 environment.acceptsProfiles判断是否处在自己设定的环境中
        boolean b = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("用户测试")
                .apiInfo(apiInfo())
                .enable(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mcss.store.customer.controller"))//扫描该包下面的API注解
//                .paths(PathSelectors.any())
                .build();

    }


    /**
     * 创建该API的基本信息（这些基本信息会展现在文档页面中）
     * 访问地址：http://项目实际地址/swagger-ui.html
     *
     * @return
     */
    public ApiInfo apiInfo() {

        Contact contact = new Contact("邓开军", "https://www.csdn.net/", "17623031618@163.com");
        return new ApiInfoBuilder()
                .title("使用Swagger2 小程序用户基本操作测试") //接口管理文档首页显示
                .description("项目描述：重庆妙传索思网络科技有限公司 购物商城小程序") //API的描述
                .termsOfServiceUrl("http://www.apache.org/licenses/LICENSE 2.0")// 个人网站url等
                .version("1.0")
                .build();
    }
}

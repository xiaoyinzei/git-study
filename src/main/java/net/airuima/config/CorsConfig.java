package net.airuima.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 跨域配置
 */
@Configuration
@Profile({"dev","local","test"})
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedHeaders("*")
                .exposedHeaders("Authorization, Link, X-Total-Count, qcs, fieldState, queryHabit, viewHabit, token, file-name, Content-Type, Content-Disposition, " +
                        "uid, X-app-alert, X-app-params, X-app-error, X-app-error-message, X-Message, message, id, tenant, inner_decode_token, inner_token")
                .allowedMethods("*")
                .allowedOriginPatterns("*");
    }
}
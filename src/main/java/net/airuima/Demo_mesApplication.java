package net.airuima;

import com.cosium.spring.data.jpa.entity.graph.repository.support.CustomJpaRepositoryFactoryBean;
import jakarta.annotation.PostConstruct;
import net.airuima.config.jwt.RuimaProperties;
import net.airuima.util.BeanUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.TimeZone;

@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = CustomJpaRepositoryFactoryBean.class)
@EnableConfigurationProperties({LiquibaseProperties.class, RuimaProperties.class})
@EnableDiscoveryClient
@ServletComponentScan
@EnableAsync
public class Demo_mesApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demo_mesApplication.class);
        BeanUtil.configurableApplicationContext = app.run(args);
    }

    @PostConstruct
    void setDefaultTimezone() {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
    }

}

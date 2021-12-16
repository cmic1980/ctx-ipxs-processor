package sg.ctx.ipxs.processor;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableAsync //开启异步
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableScheduling
@ComponentScan("sg.ctx")
public class IPXSProcessorApplication implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {

    }

    public static void main(String[] args) {
        SpringApplication.run(IPXSProcessorApplication.class, args);
    }
}

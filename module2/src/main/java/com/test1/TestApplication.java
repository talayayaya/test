package com.test1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@ComponentScan({"com.test1","com.test2"})
public class TestApplication {

    public static void main(String[] args) {
        try {
            ConfigurableApplicationContext ctx = SpringApplication.run(TestApplication.class, args);


//            CountDownLatch latch = ctx.getBean(CountDownLatch.class);

//            logger.info("Sending message...");
//            template.convertAndSend("deck", "Hello from Redis!");

//            latch.await();
        } catch (Exception e) {

            //log
        } finally {
            //release or restart server.
        }
    }
}

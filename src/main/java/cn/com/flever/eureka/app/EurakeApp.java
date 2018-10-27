package cn.com.flever.eureka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(scanBasePackages = "cn.com.flever")
public class EurakeApp {
  public static void main(String[] args) {
    SpringApplication.run(EurakeApp.class, args);
  }
}

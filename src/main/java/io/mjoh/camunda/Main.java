package io.mjoh.camunda;

import io.camunda.zeebe.spring.client.annotation.Deployment;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@Deployment(resources = "classpath*:*.bpmn")
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
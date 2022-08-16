package com.hopeguru.tjmsa.MemberBenefitService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class  MemberBenefitServiceApplication{
    public static void main (String[] args) { SpringApplication.run(MemberBenefitServiceApplication.class , args ) ; }
}
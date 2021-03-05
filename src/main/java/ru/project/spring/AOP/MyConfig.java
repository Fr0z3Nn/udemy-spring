package ru.project.spring.AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.project.spring.AOP")
@EnableAspectJAutoProxy
public class MyConfig {
}

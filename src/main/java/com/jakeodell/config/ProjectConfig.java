package com.jakeodell.config;

import com.jakeodell.beans.Parrot;
import com.jakeodell.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jakeodell.beans")
public class ProjectConfig {


}

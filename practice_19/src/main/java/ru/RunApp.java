package ru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Создан файл logback.xml, в котором
// содержится логирование  всех методы классовсервисов.
@SpringBootApplication
public class RunApp {
    public static void main(String[] args) {
        SpringApplication.run(RunApp.class, args);
    }

}

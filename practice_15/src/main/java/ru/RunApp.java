package ru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Изменить программу с предыдущего задания так, чтобы объекты
//хранились в базе данных PostgreSQL вместо памяти компьютера.

//подключение в файле Config (configuration)
@SpringBootApplication
public class RunApp {
    public static void main(String[] args) {
        SpringApplication.run(RunApp.class, args);
    }

}

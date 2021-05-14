package ru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Переписать код предыдущего задания с использованием сервисов и
//отделения логики контроллера от логики сервиса и репозитория

//подключение к БД перенесено в апликейшен, добавлены интерфейсы ItemRep, OrderRep. Config подключает репозитории
@SpringBootApplication
public class RunApp {
    public static void main(String[] args) {
        SpringApplication.run(RunApp.class, args);
    }

}

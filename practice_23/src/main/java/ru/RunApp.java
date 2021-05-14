package ru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//В приложении из предыдущего задания добавить возможность
//регистрации и авторизации пользователей, хранение cookie сессий в базе
//данных PostgreSQL, хеширование паролей алгоритмом Bcrypt, защиту всех
//запросов, кроме запросов на авторизацию и регистрацию, от
//неавторизированных пользователей.
@SpringBootApplication
public class RunApp {
    public static void main(String[] args) {
        SpringApplication.run(RunApp.class, args);



        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

package ru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Создан файл SchedulerService
//Который будет вызываться каждые 30 минут и очищать
//определённую директорию, а затем создавать по файлу для каждой из
//сущностей и загружать туда все данные из базы данных.
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

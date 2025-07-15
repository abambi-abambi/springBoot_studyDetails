package org.postgres.creatingjavaproject.services;

import org.postgres.creatingjavaproject.App;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.DriverManager;

@Component
public class ClassLoaderCheckService implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Class loader for App.class: " + App.class.getClassLoader());
        System.out.println("Class loader for String.class: " + String.class.getClassLoader());
        System.out.println("Class loader for ClassLoaderCheckService.class: " + ClassLoaderCheckService.class.getClassLoader());
        System.out.println("Class loader for DriverManager.class: " + DriverManager.class.getClassLoader());
    }
}

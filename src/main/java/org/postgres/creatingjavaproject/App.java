package org.postgres.creatingjavaproject;

import org.postgres.creatingjavaproject.services.ArgsService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
    private ArgsService argsService;

    public App(ArgsService argsService) {
        this.argsService = argsService;
    }

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
        System.out.println( "Hello from Failure Analyzer!" );

    }
}

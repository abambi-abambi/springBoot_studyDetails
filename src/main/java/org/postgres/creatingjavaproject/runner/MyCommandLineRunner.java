package org.postgres.creatingjavaproject.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * For launching some code after the application has been launched
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner, Ordered {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("My code has been called after application start");
    }

    @Override
    public int getOrder() {
        return -1;
    }
}

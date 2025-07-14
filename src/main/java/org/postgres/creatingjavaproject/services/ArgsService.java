package org.postgres.creatingjavaproject.services;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

/**
 * Service for catching all input args during application start
 */

@Component
public class ArgsService {

    public ArgsService(ApplicationArguments arguments) {
        System.out.println("List of args " + arguments.getNonOptionArgs());
    }
}

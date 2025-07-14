package org.postgres.creatingjavaproject.services;

import org.springframework.stereotype.Service;

/**
 * Service for catching wrong bean
 * by Failure Analyzer
 */
@Service
public class MyBeanFailureService {

    /**
     * Testing error with bean
     */
    /**
     * Uncomment to check custom failure catch
     */
//    @Resource(name = "MyDao")
//    private MyDao myDao;
}

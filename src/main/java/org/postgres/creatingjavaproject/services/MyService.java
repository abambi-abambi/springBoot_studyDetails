package org.postgres.creatingjavaproject.services;

import jakarta.annotation.Resource;
import org.postgres.creatingjavaproject.dao.MyDao;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Resource(name = "MyDao")
    private MyDao myDao;
}

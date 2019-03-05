package org.it.tom.service.impl;

import org.it.tom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void createUser(String name) {
        jdbcTemplate.update("insert into user values(?)",name);
    }
}

package com.ilyaselmabrouki.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Primary
public class DaoImpl implements IDao {
    @Override
    public String getDate() {
        System.out.println("Version 1");
        return new Date().toString();
    }
}

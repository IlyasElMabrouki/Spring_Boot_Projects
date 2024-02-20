package org.example.dao;

import org.example.annotation.Component;

import java.util.Date;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public String getDate() {
        System.out.println("Version 1");
        return new Date().toString();
    }
}

package org.example.dao;

import java.util.Date;

public class DaoImpl implements IDao {
    @Override
    public String getDate() {
        System.out.println("Version 1");
        return new Date().toString();
    }
}

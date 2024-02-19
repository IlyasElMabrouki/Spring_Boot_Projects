package com.ilyaselmabrouki.ext;

import com.ilyaselmabrouki.dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DaoImpl2 implements IDao {
    @Override
    public String getDate() {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println("Version 2");
        return simpleDateFormat.format(new Date());
    }
}

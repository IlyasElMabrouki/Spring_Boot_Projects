package org.example.ext;

import org.example.annotation.Component;
import org.example.dao.IDao;

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

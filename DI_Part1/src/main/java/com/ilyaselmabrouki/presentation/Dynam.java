package com.ilyaselmabrouki.presentation;

import com.ilyaselmabrouki.dao.IDao;
import com.ilyaselmabrouki.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Dynam {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cdao = Class.forName(daoClassName);
        IDao dao = (IDao) cdao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        Method method = cMetier.getMethod("MetierImpl", IDao.class);
        method.invoke(metier,dao);

        System.out.println(metier.calcul());
    }
}

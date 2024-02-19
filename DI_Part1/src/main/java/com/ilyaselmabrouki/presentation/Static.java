package com.ilyaselmabrouki.presentation;

import com.ilyaselmabrouki.dao.DaoImpl;
import com.ilyaselmabrouki.metier.MetierImpl;

public class Static {
    public static void main(String[] args) {
        MetierImpl metier = new MetierImpl(new DaoImpl());

        //metier.setDao(new DaoImpl());

        System.out.println(metier.calcul());
    }
}
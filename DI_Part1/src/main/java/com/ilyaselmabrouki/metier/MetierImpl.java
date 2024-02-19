package com.ilyaselmabrouki.metier;

import com.ilyaselmabrouki.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    private IDao dao;

    @Autowired
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public String calcul() {
        return this.dao.getDate();
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

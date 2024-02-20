package org.example.metier;

import org.example.annotation.Autowired;
import org.example.annotation.Component;
import org.example.dao.IDao;

@Component("metier")
public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl() {
    }

    @Override
    public String calcul() {
        return this.dao.getDate();
    }

    @Autowired("org.example.metier.MetierImpl")
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

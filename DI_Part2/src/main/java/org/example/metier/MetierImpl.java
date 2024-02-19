package org.example.metier;

import org.example.dao.IDao;
public class MetierImpl implements IMetier {
    private IDao dao;

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

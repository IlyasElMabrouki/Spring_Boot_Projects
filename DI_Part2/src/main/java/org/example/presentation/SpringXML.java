package org.example.presentation;

import org.example.Bean;
import org.example.ConstructorArg;
import org.example.Beans;
import org.example.dao.IDao;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class SpringXML {
    public static void main(String[] args) throws Exception {
        File xmlFile = new File("src/main/resources/applicationContext.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Beans.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        Beans beans = (Beans) jaxbUnmarshaller.unmarshal(xmlFile);

        for (Bean bean : beans.getBeans()) {
            Class classObject = Class.forName(bean.getClazz());
            IDao dao = (IDao) classObject.newInstance();



            System.out.println("Bean id: " + bean.getId());
            System.out.println("Bean class: " + bean.getClazz());
            ConstructorArg constructorArg = bean.getConstructorArg();
            if (constructorArg != null) {
                System.out.println("Constructor arg ref: " + constructorArg.getRef());
            }
            System.out.println();
        }
    }

}

package org.example.presentation;

import org.example.annotation.AnnotationProcessor;
import org.example.dao.DaoImpl;
import org.example.dao.IDao;
import org.example.ext.DaoImpl2;
import org.example.metier.IMetier;
import org.example.metier.MetierImpl;

public class SpringAnnotation {
    public static void main(String[] args) throws Exception {
        AnnotationProcessor annotationProcessor1 = new AnnotationProcessor(DaoImpl2.class);
        annotationProcessor1.getClassAnnotations();
        IDao dao = (IDao) annotationProcessor1.getBean("org.example.ext.DaoImpl2");
        System.out.println(dao.getDate());

        AnnotationProcessor annotationProcessor2 = new AnnotationProcessor(MetierImpl.class);
        annotationProcessor2.getClassAnnotations();
        annotationProcessor2.getMethodAnnotations();

        IMetier metier= (IMetier) annotationProcessor2.getBean("org.example.metier.MetierImpl");
        System.out.println(metier.calcul());
    }
}

package org.example.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;

import org.example.dao.IDao;
import org.example.metier.IMetier;

public class AnnotationProcessor {
    private static Class<?> clazz;
    private static Map<String, Object> annotationMap = new HashMap<>();

    public static Map<String, Object> getAnnotationMap() {
        return annotationMap;
    }

    public AnnotationProcessor(Class<?> clazz) {
        this.clazz = clazz;
    }

    public void getClassAnnotations() throws Exception {
        // Get annotations declared on the class
        Annotation[] annotations = clazz.getAnnotations();

        // Process annotations
        for (Annotation annotation : annotations) {
            if (annotation instanceof Component) {
                Component myAnnotation = (Component) annotation;
                Object o = Class.forName(clazz.getName()).newInstance();
                if (o instanceof IDao) {
                    // Dynamically cast the object to the IDao interface
                    IDao dao = (IDao) o;
                    annotationMap.put(clazz.getName(),dao);
                }
                else if (o instanceof IMetier) {
                    // Dynamically cast the object to the IMetier interface
                    IMetier metier = (IMetier) o;
                    annotationMap.put(clazz.getName(),metier);
                }
            }
        }
    }

    public void getMethodAnnotations() throws Exception {
        Method[] methods = clazz.getDeclaredMethods();

        // Iterate through methods
        for (Method method : methods) {
            // Get annotations declared on the method
            Annotation[] annotations = method.getAnnotations();
            Parameter[] parameters = method.getParameters();

            // Process annotations
            for (Annotation annotation : annotations) {
                if (annotation instanceof Autowired) {
                    Object o = annotationMap.get(((Autowired) annotation).value());
                    Class param = Class.forName(parameters[0].getType().getName());
                    Method myMethod = o.getClass().getMethod(method.getName(), param);
                    myMethod.invoke(o,getAnnotationMap().get(parameters[0].getType().getName()));
                }
            }
        }
    }

    public Object getBean(String bean){
        return annotationMap.get(bean);
    }
}

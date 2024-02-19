package org.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "bean")
public class Bean {
    private String id;

    private String clazz;

    private ConstructorArg constructorArg;

    @XmlElement(name = "constructor-arg")
    public ConstructorArg getConstructorArg() {
        return constructorArg;
    }

    public void setConstructorArg(ConstructorArg constructorArg) {
        this.constructorArg = constructorArg;
    }

    @XmlAttribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlAttribute(name = "class")
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
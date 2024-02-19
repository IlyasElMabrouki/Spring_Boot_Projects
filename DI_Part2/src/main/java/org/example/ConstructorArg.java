package org.example;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class ConstructorArg {
    private String ref;

    @XmlAttribute
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}

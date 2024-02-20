package org.example.xml;

import org.example.xml.Bean;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
public class Beans {
    private List<Bean> beans;

    @XmlElement(name = "bean")
    public List<Bean> getBeans() {
        return beans;
    }

    public void setBeans(List<Bean> beans) {
        this.beans = beans;
    }
}


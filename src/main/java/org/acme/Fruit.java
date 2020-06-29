package org.acme;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Fruit extends PanacheEntity {
    public String name;
    @JsonIgnore
    public String ignoredProperty;

    public Fruit() {
    }

    public Fruit(String name, String ignoredProperty) {
        this.name = name;
        this.ignoredProperty = ignoredProperty;
    }

//    @JsonIgnore
//    public String getIgnoredProperty() {
//        return ignoredProperty;
//    }

}

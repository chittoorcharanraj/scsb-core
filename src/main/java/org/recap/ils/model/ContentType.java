package org.recap.ils.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by SheikS on 6/22/2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "content", propOrder = {
        "collection"
})

@XmlRootElement(name = "content")
public class ContentType implements Serializable {
    /**
     * The Collection.
     */
    @XmlElement(required = true, nillable = true)
    protected CollectionType collection;

    /**
     * Gets collection.
     *
     * @return the collection
     */
    public CollectionType getCollection() {
        return collection;
    }

    /**
     * Sets collection.
     *
     * @param collection the collection
     */
    public void setCollection(CollectionType collection) {
        this.collection = collection;
    }
}

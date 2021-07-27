/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.openaire.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import eu.openaire.oaf.model.base.Entity;

/**
 * 
 * @author dpie
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Metadata {
    @XmlElement(name="entity", namespace="http://namespace.openaire.eu/oaf") 
    private Entity entity;

    public Entity getEntity() {
        return entity;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openaire.funders.jaxb.model;

/**
 *
 * @author dpie
 */
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
 
@XmlType
public class Results {
    
    private List<Result> result;

    public List<Result> getResult() {
    	if (result == null) {
    		result = new ArrayList<Result>();
    	}
        return result;
    }

    public void setResult(List<Result> result) {
        this.getResult().addAll(result);
    }


}

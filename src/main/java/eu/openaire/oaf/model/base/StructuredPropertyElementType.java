//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.26 at 04:31:46 PM UTC 
//


package eu.openaire.oaf.model.base;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for structuredPropertyElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="structuredPropertyElementType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attGroup ref="{http://namespace.openaire.eu/oaf}dataInfoAttributeGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "structuredPropertyElementType", propOrder = {
    "value"
})
public class StructuredPropertyElementType implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected String value;
    @XmlAttribute(name = "inferred")
    protected Boolean inferred;
    @XmlAttribute(name = "trust")
    protected String trust;
    @XmlAttribute(name = "inferenceprovenance")
    protected String inferenceprovenance;
    @XmlAttribute(name = "classid", required = true)
    protected String classid;
    @XmlAttribute(name = "classname", required = true)
    protected String classname;
    @XmlAttribute(name = "schemeid", required = true)
    protected String schemeid;
    @XmlAttribute(name = "schemename", required = true)
    protected String schemename;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the inferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInferred() {
        return inferred;
    }

    /**
     * Sets the value of the inferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInferred(Boolean value) {
        this.inferred = value;
    }

    /**
     * Gets the value of the trust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrust() {
        return trust;
    }

    /**
     * Sets the value of the trust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrust(String value) {
        this.trust = value;
    }

    /**
     * Gets the value of the inferenceprovenance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInferenceprovenance() {
        return inferenceprovenance;
    }

    /**
     * Sets the value of the inferenceprovenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInferenceprovenance(String value) {
        this.inferenceprovenance = value;
    }

    /**
     * Gets the value of the classid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassid() {
        return classid;
    }

    /**
     * Sets the value of the classid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassid(String value) {
        this.classid = value;
    }

    /**
     * Gets the value of the classname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassname() {
        return classname;
    }

    /**
     * Sets the value of the classname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassname(String value) {
        this.classname = value;
    }

    /**
     * Gets the value of the schemeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeid() {
        return schemeid;
    }

    /**
     * Sets the value of the schemeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeid(String value) {
        this.schemeid = value;
    }

    /**
     * Gets the value of the schemename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemename() {
        return schemename;
    }

    /**
     * Sets the value of the schemename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemename(String value) {
        this.schemename = value;
    }

}

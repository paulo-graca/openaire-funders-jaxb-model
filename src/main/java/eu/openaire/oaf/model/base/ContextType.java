//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.26 at 04:31:46 PM UTC 
//


package eu.openaire.oaf.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://namespace.openaire.eu/oaf}labeledIdElementType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="category" type="{http://namespace.openaire.eu/oaf}categoryType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://namespace.openaire.eu/oaf}dataInfoAttributeGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contextType", propOrder = {
    "category"
})
public class ContextType
    extends LabeledIdElementType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<CategoryType> category;
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
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryType }
     * 
     * 
     */
    public List<CategoryType> getCategory() {
        if (category == null) {
            category = new ArrayList<CategoryType>();
        }
        return this.category;
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

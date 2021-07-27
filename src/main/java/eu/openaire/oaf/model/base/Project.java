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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acronym" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="callidentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contactfullname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contactfax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contactphone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contactemail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contracttype" type="{http://namespace.openaire.eu/oaf}qualifierType"/&gt;
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="websiteurl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="startdate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="enddate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ecsc39" type="{http://namespace.openaire.eu/oaf}boolOrEmptyType"/&gt;
 *         &lt;element name="oamandatepublications" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ecarticle29_3" type="{http://namespace.openaire.eu/oaf}boolOrEmptyType"/&gt;
 *         &lt;element name="subjects" type="{http://namespace.openaire.eu/oaf}qualifierType"/&gt;
 *         &lt;element name="fundingtree" type="{http://namespace.openaire.eu/oaf}fundingTreeType"/&gt;
 *         &lt;element name="originalId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="collectedfrom" type="{http://namespace.openaire.eu/oaf}namedIdElementType"/&gt;
 *         &lt;element name="pid" type="{http://namespace.openaire.eu/oaf}qualifierType"/&gt;
 *         &lt;element name="rels" type="{http://namespace.openaire.eu/oaf}relsType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codeOrTitleOrAcronym"
})
@XmlRootElement(name = "project")
public class Project
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "code", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "acronym", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "callidentifier", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contactfullname", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contactfax", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contactphone", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contactemail", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contracttype", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "keywords", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "websiteurl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "startdate", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "enddate", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "duration", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ecsc39", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "oamandatepublications", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ecarticle29_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subjects", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fundingtree", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "originalId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "collectedfrom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pid", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rels", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> codeOrTitleOrAcronym;

    /**
     * Gets the value of the codeOrTitleOrAcronym property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeOrTitleOrAcronym property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeOrTitleOrAcronym().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link QualifierType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link QualifierType }{@code >}
     * {@link JAXBElement }{@code <}{@link FundingTreeType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link NamedIdElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link QualifierType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelsType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getCodeOrTitleOrAcronym() {
        if (codeOrTitleOrAcronym == null) {
            codeOrTitleOrAcronym = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.codeOrTitleOrAcronym;
    }

}

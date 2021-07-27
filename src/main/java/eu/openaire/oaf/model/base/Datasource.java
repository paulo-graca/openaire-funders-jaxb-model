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
 *         &lt;element name="namespaceprefix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="officialname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="englishname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="websiteurl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="logourl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contactemail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="datasourcetype" type="{http://namespace.openaire.eu/oaf}qualifierType"/&gt;
 *         &lt;element name="openairecompatibility" type="{http://namespace.openaire.eu/oaf}qualifierType"/&gt;
 *         &lt;element name="dateofvalidation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subjects" type="{http://namespace.openaire.eu/oaf}structuredPropertyElementType"/&gt;
 *         &lt;element name="originalId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="collectedfrom" type="{http://namespace.openaire.eu/oaf}namedIdElementType"/&gt;
 *         &lt;element name="pid" type="{http://namespace.openaire.eu/oaf}structuredPropertyElementType"/&gt;
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
    "namespaceprefixOrOfficialnameOrEnglishname"
})
@XmlRootElement(name = "datasource")
public class Datasource
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "namespaceprefix", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "officialname", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "englishname", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "websiteurl", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "logourl", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contactemail", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "datasourcetype", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "openairecompatibility", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dateofvalidation", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "latitude", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "longitude", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "description", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subjects", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "originalId", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "collectedfrom", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pid", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rels", namespace = "http://namespace.openaire.eu/oaf", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> namespaceprefixOrOfficialnameOrEnglishname;

    /**
     * Gets the value of the namespaceprefixOrOfficialnameOrEnglishname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namespaceprefixOrOfficialnameOrEnglishname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamespaceprefixOrOfficialnameOrEnglishname().add(newItem);
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
     * {@link JAXBElement }{@code <}{@link QualifierType }{@code >}
     * {@link JAXBElement }{@code <}{@link QualifierType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link StructuredPropertyElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link NamedIdElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link StructuredPropertyElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelsType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getNamespaceprefixOrOfficialnameOrEnglishname() {
        if (namespaceprefixOrOfficialnameOrEnglishname == null) {
            namespaceprefixOrOfficialnameOrEnglishname = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.namespaceprefixOrOfficialnameOrEnglishname;
    }

}

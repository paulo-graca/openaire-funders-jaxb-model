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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fundingTreeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fundingTreeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="funder" type="{http://namespace.openaire.eu/oaf}funderType"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element name="funding_level_2" type="{http://namespace.openaire.eu/oaf}fundingType"/&gt;
 *           &lt;element name="funding_level_1" type="{http://namespace.openaire.eu/oaf}fundingType"/&gt;
 *           &lt;element name="funding_level_0" type="{http://namespace.openaire.eu/oaf}fundingType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fundingTreeType", propOrder = {
    "funder",
    "fundingLevel2OrFundingLevel1OrFundingLevel0"
})
public class FundingTreeType implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "", required = true)
    protected FunderType funder;
    @XmlElementRefs({
        @XmlElementRef(name = "funding_level_2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "funding_level_1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "funding_level_0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<FundingType>> fundingLevel2OrFundingLevel1OrFundingLevel0;

    /**
     * Gets the value of the funder property.
     * 
     * @return
     *     possible object is
     *     {@link FunderType }
     *     
     */
    public FunderType getFunder() {
        return funder;
    }

    /**
     * Sets the value of the funder property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunderType }
     *     
     */
    public void setFunder(FunderType value) {
        this.funder = value;
    }

    /**
     * Gets the value of the fundingLevel2OrFundingLevel1OrFundingLevel0 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundingLevel2OrFundingLevel1OrFundingLevel0 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundingLevel2OrFundingLevel1OrFundingLevel0().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FundingType }{@code >}
     * {@link JAXBElement }{@code <}{@link FundingType }{@code >}
     * {@link JAXBElement }{@code <}{@link FundingType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<FundingType>> getFundingLevel2OrFundingLevel1OrFundingLevel0() {
        if (fundingLevel2OrFundingLevel1OrFundingLevel0 == null) {
            fundingLevel2OrFundingLevel1OrFundingLevel0 = new ArrayList<JAXBElement<FundingType>>();
        }
        return this.fundingLevel2OrFundingLevel1OrFundingLevel0;
    }

}

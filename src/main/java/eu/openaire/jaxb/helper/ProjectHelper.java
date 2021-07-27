package eu.openaire.jaxb.helper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import eu.openaire.oaf.model.base.FundingTreeType;
import eu.openaire.oaf.model.base.NamedIdElementType;
import eu.openaire.oaf.model.base.QualifierType;
import eu.openaire.oaf.model.base.RelsType;

/**
 * This ProjectHelper is a way to facilitate api methods for Project since the
 * only one provided (because of the flexible schema model) is
 * getCodeOrTitleOrAcronym
 * 
 * Each field is returned as a collection because each Element could have
 * multiple instances
 * 
 * @author pgraca
 *
 */
public class ProjectHelper {
	private Map<String, Collection<String>> stringTypeProperties;
	private Map<String, Collection<FundingTreeType>> fundingTreeTypeProperties;
	private Map<String, Collection<NamedIdElementType>> namedIdElementTypeProperties;
	private Map<String, Collection<QualifierType>> qualifierTypeProperties;
	private Map<String, Collection<Boolean>> booleanTypeProperties;
	private Map<String, Collection<RelsType>> relsTypeProperties;

	public ProjectHelper(List<JAXBElement<? extends Serializable>> projectProperties) {
		this.stringTypeProperties = new HashMap<String, Collection<String>>();
		this.fundingTreeTypeProperties = new HashMap<String, Collection<FundingTreeType>>();
		this.namedIdElementTypeProperties = new HashMap<String, Collection<NamedIdElementType>>();
		this.qualifierTypeProperties = new HashMap<String, Collection<QualifierType>>();
		this.booleanTypeProperties = new HashMap<String, Collection<Boolean>>();
		this.relsTypeProperties = new HashMap<String, Collection<RelsType>>();

		for (JAXBElement<?> element : projectProperties) {
			String nodeName = element.getName().getLocalPart();
			String nodeType = element.getDeclaredType().getSimpleName();
			Object castValue = element.getDeclaredType().cast(element.getValue());

			switch (nodeType) {
			case "String":
				Collection<String> stringCollection = this.stringTypeProperties.getOrDefault(nodeName,
						new ArrayList<>());
				stringCollection.add((String) castValue);
				this.stringTypeProperties.put(nodeName, stringCollection);
				break;
			case "FundingTreeType":
				Collection<FundingTreeType> fundingTreeTypeCollection = this.fundingTreeTypeProperties
						.getOrDefault(nodeName, new ArrayList<>());
				fundingTreeTypeCollection.add((FundingTreeType) castValue);
				this.fundingTreeTypeProperties.put(nodeName, fundingTreeTypeCollection);
				break;
			case "NamedIdElementType":
				Collection<NamedIdElementType> namedIdElementTypeCollection = this.namedIdElementTypeProperties
						.getOrDefault(nodeName, new ArrayList<>());
				namedIdElementTypeCollection.add((NamedIdElementType) castValue);
				this.namedIdElementTypeProperties.put(nodeName, namedIdElementTypeCollection);
				break;
			case "QualifierType":
				Collection<QualifierType> qualifierTypeCollection = this.qualifierTypeProperties.getOrDefault(nodeName,
						new ArrayList<>());
				qualifierTypeCollection.add((QualifierType) castValue);
				this.qualifierTypeProperties.put(nodeName, qualifierTypeCollection);
				break;
			case "Boolean":
				Collection<Boolean> booleanTypeCollection = this.booleanTypeProperties.getOrDefault(nodeName,
						new ArrayList<>());
				booleanTypeCollection.add((Boolean) castValue);
				this.booleanTypeProperties.put(nodeName, booleanTypeCollection);
				break;
			case "RelsType":
				Collection<RelsType> relsTypeCollection = this.relsTypeProperties.getOrDefault(nodeName,
						new ArrayList<>());
				relsTypeCollection.add((RelsType) castValue);
				this.relsTypeProperties.put(nodeName, relsTypeCollection);
				break;

			}

		}
	}

	public Collection<String> getCodes() {
		return getStringValue("code");
	}

	public Collection<String> getAcronyms() {
		return getStringValue("acronym");
	}

	public Collection<String> getCallIdentifiers() {
		return getStringValue("callidentifier");
	}

	public Collection<String> getTitles() {
		return getStringValue("title");
	}

	public Collection<String> getStartDates() {
		return getStringValue("startdate");
	}

	public Collection<String> getDurations() {
		return getStringValue("duration");
	}

	public Collection<String> getEndDates() {
		return getStringValue("enddate");
	}

	public Collection<String> getOriginalIds() {
		return getStringValue("originalId");
	}

	public Collection<String> getContactFullNames() {
		return getStringValue("contactfullname");
	}

	public Collection<String> getContactFaxes() {
		return getStringValue("contactfax");
	}

	public Collection<String> getContactPhones() {
		return getStringValue("contactphone");
	}

	public Collection<String> getContactEmails() {
		return getStringValue("contactemail");
	}

	public Collection<String> getKeywords() {
		return getStringValue("keywords");
	}

	public Collection<String> getWebsiteUrls() {
		return getStringValue("websiteurl");
	}

	public Collection<String> getECArticle29_3s() {
		// TODO: should be boolean
		return getStringValue("ecarticle29_3");
	}

	public Collection<String> getECSc39s() {
		// TODO: should be boolean
		return getStringValue("ecsc39");
	}

	public Collection<Boolean> getOAMandatePublications() {
		return getBooleanValue("oamandatepublications");
	}

	public Collection<FundingTreeType> getFundingTreeTypes() {
		return getFundingTypeValue("fundingtree");
	}

	public Collection<RelsType> getRels() {
		return getRelsTypeValue("rels");
	}

	public Collection<QualifierType> getContractTypes() {
		return getQualifierTypeValue("contracttype");
	}

	public Collection<QualifierType> getSubjects() {
		return getQualifierTypeValue("subjects");
	}

	public Collection<QualifierType> getPids() {
		return getQualifierTypeValue("pid");
	}

	public Collection<NamedIdElementType> getCollectedFroms() {
		return getNamedIdElementTypeValue("collectedfrom");
	}

	private Collection<String> getStringValue(String fieldName) {
		return this.stringTypeProperties.getOrDefault(fieldName,new ArrayList<>());
	}

	private Collection<FundingTreeType> getFundingTypeValue(String fieldName) {
		return this.fundingTreeTypeProperties.getOrDefault(fieldName,new ArrayList<>());
	}

	private Collection<NamedIdElementType> getNamedIdElementTypeValue(String fieldName) {
		return this.namedIdElementTypeProperties.getOrDefault(fieldName,new ArrayList<>());
	}

	private Collection<QualifierType> getQualifierTypeValue(String fieldName) {
		return this.qualifierTypeProperties.getOrDefault(fieldName,new ArrayList<>());
	}

	private Collection<Boolean> getBooleanValue(String fieldName) {
		return this.booleanTypeProperties.getOrDefault(fieldName,new ArrayList<>());
	}

	private Collection<RelsType> getRelsTypeValue(String fieldName) {
		return this.relsTypeProperties.getOrDefault(fieldName,new ArrayList<>());
	}

}

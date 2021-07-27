package eu.openaire.jaxb.helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import eu.openaire.oaf.model.base.FundingType;

public class FundingHelper {
	private Map<String, Collection<FundingType>> fundingTypeProperties;
	
	public FundingHelper (List<JAXBElement<FundingType>> fundingProperties) {
		this.fundingTypeProperties = new HashMap<String, Collection<FundingType>>();
		
		for (JAXBElement<?> element : fundingProperties) {
			String nodeName = element.getName().getLocalPart();
			String nodeType = element.getDeclaredType().getSimpleName();
			Object castValue = element.getDeclaredType().cast(element.getValue());

			switch (nodeType) {
			case "FundingType":
				Collection<FundingType> fundingTypeCollection = this.fundingTypeProperties.getOrDefault(nodeName,
						new ArrayList<>());
				fundingTypeCollection.add((FundingType) castValue);
				this.fundingTypeProperties.put(nodeName, fundingTypeCollection);
				break;
			}
		}
		
	}

	public Collection<FundingType> getFirstAvailableFunding() {
		if (this.fundingTypeProperties.containsKey("funding_level_2")) {
			return getFundingTypeValue("funding_level_2");
		}
		if (this.fundingTypeProperties.containsKey("funding_level_1")) {
			return getFundingTypeValue("funding_level_1");
		}		
		return getFundingTypeValue("funding_level_0");
	}	
	
	public Collection<FundingType> getFundingLevel2() {		
		return getFundingTypeValue("funding_level_2");
	}
	
	public Collection<FundingType> getFundingLevel1() {
		return getFundingTypeValue("funding_level_1");
	}
	
	public Collection<FundingType> getFundingLevel0() {
		return getFundingTypeValue("funding_level_0");
	}	
	
	private Collection<FundingType> getFundingTypeValue(String fieldName) {
		return this.fundingTypeProperties.getOrDefault(fieldName,new ArrayList<>());
	}	
}

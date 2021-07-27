package eu.openaire.jaxb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.InputStream;
/**
 *
 * @author pgraca
 */
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBException;

import org.junit.jupiter.api.Test;

import eu.openaire.jaxb.helper.FundingHelper;
import eu.openaire.jaxb.helper.OpenAIREHandler;
import eu.openaire.jaxb.helper.ProjectHelper;
import eu.openaire.jaxb.model.Response;
import eu.openaire.jaxb.model.Result;
import eu.openaire.oaf.model.base.FundingTreeType;

public class SearchTest {
	private static final String PROJECTS_FILE = "projects.xml";

	@Test
	public void testProjectSpecificCode() throws JAXBException, IOException {
		InputStream is = getClass().getClassLoader().getResourceAsStream(PROJECTS_FILE);

		Response response = OpenAIREHandler.unmarshal(is);
		is.close();
		Result result = response.getResults().getResult().get(0);
		assertNotNull(result);
		assertNotNull(result.getMetadata().getEntity().getProject());
		ProjectHelper project = new ProjectHelper(
				result.getMetadata().getEntity().getProject().getCodeOrTitleOrAcronym());

		assertEquals(project.getCodes().stream().findFirst().get(), "231807");
	}
	
	
	@Test
	public void testProjectFundingWebSpecificProgram() throws JAXBException, IOException {
		InputStream is = getClass().getClassLoader().getResourceAsStream(PROJECTS_FILE);

		Response response = OpenAIREHandler.unmarshal(is);
		is.close();
		Result result = response.getResults().getResult().get(0);
		assertNotNull(result);
		assertNotNull(result.getMetadata().getEntity().getProject());
		ProjectHelper project = new ProjectHelper(
				result.getMetadata().getEntity().getProject().getCodeOrTitleOrAcronym());
		FundingTreeType fundingTree = project.getFundingTreeTypes().stream().findFirst().get();
		FundingHelper funding = new FundingHelper(fundingTree.getFundingLevel2OrFundingLevel1OrFundingLevel0());

		assertEquals(funding.getFirstAvailableFunding().stream().findFirst().get().getName(), "ICT");
	}

	@Test
	public void testProjectWebSpecificCode() throws JAXBException, MalformedURLException {

		// Unmarshalling: Converting XML content to Java objects
		URL url = new URL("https://api.openaire.eu/search/projects?keywords=epiwork");

		Response response = OpenAIREHandler.unmarshal(url);

		Result result = response.getResults().getResult().get(0);

		assertNotNull(result);
		assertNotNull(result.getMetadata().getEntity().getProject());
		ProjectHelper project = new ProjectHelper(
				result.getMetadata().getEntity().getProject().getCodeOrTitleOrAcronym());

		assertNotNull(project.getCodes());
		assertEquals(project.getCodes().iterator().next(), "231807");

	}


}
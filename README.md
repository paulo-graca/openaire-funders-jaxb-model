# OpenAIRE Funders Model

This repository contains the data model used in the OpenAIRE Funders API.

Use this JAR as a dependency in projects for marshalling and unmarshalling OpenAIRE Funders API.

## Usage examples

	InputStream is = getClass().getClassLoader().getResourceAsStream("example.xml");
	
	Response response = OpenAIREHandler.unmarshal(is);
	is.close();
	
	//We can have multiple results, let's pick the first one
	Result result = response.getResults().getResult().get(0);
	
	assertNotNull(result);
	assertNotNull(result.getMetadata().getEntity().getProject());
	
	ProjectHelper projectHelper = new ProjectHelper(
			result.getMetadata().getEntity().getProject().getCodeOrTitleOrAcronym());

			
	// get the first item (according to the model can have multiple)
	System.out.println ("Project Code: " + projectHelper.getCodes().stream().findFirst().get());

	// get all titles in a project
	for (String title : projectHelper.getTitles()) {
		System.out.println("Title: " + title);
	}

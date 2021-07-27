/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.openaire.jaxb.helper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import eu.openaire.jaxb.model.Response;

/**
 * This Class handles the Marshaling from provided sources like URL or
 * InputStream
 * 
 * @author dpie
 * @author pgraca
 *
 */
public class OpenAIREHandler {

	// Export: Marshalling
	public static void marshal(Response response, File selectedFile) throws IOException, JAXBException {
		JAXBContext context;
		BufferedWriter writer = null;
		writer = new BufferedWriter(new FileWriter(selectedFile));
		context = JAXBContext.newInstance(Response.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(response, writer);
		writer.close();
	}

	// Import: Unmarshalling
	public static Response unmarshal(URL importFile) throws JAXBException {
		Response response = null;
		JAXBContext context;

		context = JAXBContext.newInstance(Response.class);
		Unmarshaller um = context.createUnmarshaller();
		response = (Response) um.unmarshal(importFile);

		return response;
	}

	/**
	 * Unmarshal and returns a Response from an InputStream
	 * 
	 * @param iStream
	 * @return
	 * @throws JAXBException
	 */
	public static Response unmarshal(InputStream iStream) throws JAXBException {
		Response response = null;
		JAXBContext context;

		context = JAXBContext.newInstance(Response.class);
		Unmarshaller um = context.createUnmarshaller();
		response = (Response) um.unmarshal(iStream);

		return response;
	}
}

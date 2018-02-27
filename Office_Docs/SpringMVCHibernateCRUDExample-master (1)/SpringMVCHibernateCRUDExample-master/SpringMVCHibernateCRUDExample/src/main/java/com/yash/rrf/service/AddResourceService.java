package com.yash.rrf.service;

import java.io.IOException;

import com.itextpdf.text.DocumentException;
import com.yash.rrf.model.*;
public interface AddResourceService {

	public void saveResourceDetails(ResourceDetails resourceDetails);
	public void generatePdf() throws DocumentException, IOException;
		
	
}

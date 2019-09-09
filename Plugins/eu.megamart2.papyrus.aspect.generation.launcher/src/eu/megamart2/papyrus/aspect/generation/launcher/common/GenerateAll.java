/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package eu.megamart2.papyrus.aspect.generation.launcher.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import eu.megamart2.papyrus.aspect.generation.main.Generate;


/**
 * Main entry point of the 'AspectJ Code' generation module.
 */
public class GenerateAll {

	/**
	 * The model URI.
	 */
	private URI modelURI;

	/**
	 * The output folder.
	 */
	private IContainer targetFolder;

	/**
	 * The other arguments.
	 */
	List<? extends Object> arguments;

	/**
	 * Constructor.
	 * 
	 * @param modelURI
	 *            is the URI of the model.
	 * @param targetFolder
	 *            is the output folder
	 * @param arguments
	 *            are the other arguments
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public GenerateAll(URI modelURI, IContainer targetFolder, List<? extends Object> arguments) {
		this.modelURI = modelURI;
		this.targetFolder = targetFolder;
		this.arguments = arguments;
	}

	/**
	 * Launches the generation.
	 *
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public void doGenerate(IProgressMonitor monitor) throws IOException {
		if (!targetFolder.getLocation().toFile().exists()) {
			targetFolder.getLocation().toFile().mkdirs();
		}
		
		monitor.subTask("Loading...");
		eu.megamart2.papyrus.aspect.generation.main.Generate gen0 = new eu.megamart2.papyrus.aspect.generation.main.Generate(modelURI, targetFolder.getLocation().toFile(), arguments);
		monitor.worked(1);
		String generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("eu.megamart2.papyrus.aspect.generation", "eu.megamart2.papyrus.aspect.generation.main.Generate", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
		gen0.setGenerationID(generationID);
		gen0.doGenerate(BasicMonitor.toMonitor(monitor));
			
		EObject model = gen0.getModel();
		if (model != null) {
				
			
			monitor.subTask("Loading...");
			Generate gen1 = new Generate(model, targetFolder.getLocation().toFile(), arguments);
			monitor.worked(1);
			generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("eu.megamart2.papyrus.aspect.generation", "eu.megamart2.papyrus.aspect.generation.queries.AspectQueries", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
			gen1.setGenerationID(generationID);
			gen1.doGenerate(BasicMonitor.toMonitor(monitor));
		}
			
		
	}

}
